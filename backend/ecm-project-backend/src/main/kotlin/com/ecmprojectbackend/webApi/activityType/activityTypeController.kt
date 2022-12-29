package com.ecmprojectbackend.webApi.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.activityType.ActivityTypeService
import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.webApi.activityType.representation.ActivityTypeRepresentation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("activitytype")
class activityTypeController(
    private val activityTypeService: ActivityTypeService
    ) {
    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody activityTypeRepresentation: ActivityTypeRepresentation): ActivityType {
        return activityTypeService.save(ActivityType(
            activityTypeRepresentation.id,
            activityTypeRepresentation.name,
            activityTypeRepresentation.type,
            Page(
                activityTypeRepresentation.pageId,
                null,
                "",
                ""
            ),
            ProcessType(
                activityTypeRepresentation.processId,
                null,
                "",
                ""
            ),
            null
            ))
    }

    @GetMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun get(): List<ActivityType> {
        return activityTypeService.getAll()
    }

    @DeleteMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun delete(@RequestParam activityTypeId: String) {
        activityTypeService.remove(ActivityType(activityTypeId, "", "", null, null, null))
    }

}