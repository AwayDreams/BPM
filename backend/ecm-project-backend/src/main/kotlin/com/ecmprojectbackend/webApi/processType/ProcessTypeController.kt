package com.ecmprojectbackend.webApi.process

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.domain.processType.ProcessTypeService
import com.ecmprojectbackend.webApi.bpm.representation.BpmRepresentation
import com.ecmprojectbackend.webApi.processType.representation.ProcessTypeRepresentation
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("processType")
class ProcessTypeController(
    private val processTypeService: ProcessTypeService
) {
    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody processTypeRepresentation: ProcessTypeRepresentation): ProcessType {
        return processTypeService.save(
                ProcessType(
                    processTypeRepresentation.id,
                    processTypeRepresentation.version,
                    DataType(
                        processTypeRepresentation.dataTypeId,
                        null
                    ),
                    processTypeRepresentation.name,
                    processTypeRepresentation.content,
                    null
                )
            )
    }



    @GetMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun getAll(): List<ProcessType> {
        return processTypeService.getAll()
    }
    @GetMapping(path = ["/{processTypeId}"], produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun get(@PathVariable processTypeId: Long): ProcessType {
        return processTypeService.get(processTypeId)
    }

    @DeleteMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun delete(@RequestParam processTypeId: Long) {
        processTypeService.remove(
            ProcessType(
                processTypeId,
                0,
                DataType(
                    null,
                    null
                ),
                "",
                "",
                null
            )
        )
    }
}