package com.ecmprojectbackend.webApi.process

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.domain.page.PageService
import com.ecmprojectbackend.domain.process.ProcessService
import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.webApi.page.representation.PageRepresentation
import com.ecmprojectbackend.webApi.process.representation.ProcessRepresentation
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("process")
class ProcessController(
    private val processService: ProcessService
) {
    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody processRepresentation: ProcessRepresentation): Process {
        return processService.save(
            Process(
                processRepresentation.id,
                ProcessType(
                    processRepresentation.processTypeId,
                    0,
                    null,
                    "",
                    "",
                    null
                ),
                ActivityType(
                    processRepresentation.activityTypeId,
                    "",
                    "",
                    null,
                    null,
                    null,
                    null
                ),

            )
        )
    }

    @GetMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun getAll(): List<Process> {
        return processService.getAll()
    }
    @GetMapping(path = ["/{processId}"], produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun get(@PathVariable processId: Long): Process {
        return processService.get(processId)
    }

    @DeleteMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun delete(@RequestParam processId: Long) {
        processService.remove(
            Process(
                processId,
                ProcessType(
                    null,
                    0,
                    null,
                    "",
                    "",
                    null,
                ),
                ActivityType(
                    null,
                    "",
                    "",
                    null,
                    null,
                    null,
                    null
                )
            )
        )
    }
}