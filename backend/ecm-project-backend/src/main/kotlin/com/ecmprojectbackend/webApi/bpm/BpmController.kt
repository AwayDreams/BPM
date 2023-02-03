package com.ecmprojectbackend.webApi.bpm

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.bpm.Bpm
import com.ecmprojectbackend.domain.bpm.BpmService
import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.groupPermission.GroupPermission
import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.domain.processType.ProcessTypeService
import com.ecmprojectbackend.domain.route.Route
import com.ecmprojectbackend.webApi.bpm.representation.BpmRepresentation
import com.ecmprojectbackend.webApi.processType.representation.ProcessTypeRepresentation
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("bpm")
class BpmController(
    private val bpmService: BpmService
) {
    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody bpmRepresentation: BpmRepresentation): ProcessType {
        return bpmService.save(
            Bpm(
              ProcessType(
                  bpmRepresentation.processType.id,
                  bpmRepresentation.processType.version,
                  DataType(
                      bpmRepresentation.processType.dataTypeId,
                      ""
                  ),
                  bpmRepresentation.processType.name,
                  bpmRepresentation.processType.content,
                  if(bpmRepresentation.processType.firstActivityId != null) ActivityType(
                      bpmRepresentation.processType.firstActivityId,
                      "",
                      "",
                      null,
                      null,
                      null,
                      null
                  ) else null
              ),
              bpmRepresentation.activityTypes.map {
                  ActivityType(
                      it.id,
                      it.name,
                      it.type,
                      Page(
                          it.pageId,
                          null,
                          "",
                          ""
                      ),
                      ProcessType(
                          it.processTypeId,
                          0,
                          null,
                          "",
                          "",
                          null
                      ),
                      listOf(),
                      listOf()
                  )
              },
              bpmRepresentation.routes.map {
                  Route(
                      it.id,
                      it.name,
                      it.nameKey,
                      it.content,
                      if(it.activity == null) null else
                      ActivityType(
                          it.activity,
                          "",
                          "",
                          null,
                          null,
                          null,
                          null
                      ),
                      if(it.nextActivity == null) null else
                          ActivityType(
                              it.nextActivity,
                              "",
                              "",
                              null,
                              null,
                              null,
                              null
                          )
                  )
              }
            )
        )
    }

    @GetMapping(path=["/iniciar/{processTypeId}"],produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun iniciarProcesso(@PathVariable processTypeId: Long): Process {
        return bpmService.iniciarProcesso(processTypeId)
    }
}