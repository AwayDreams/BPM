package com.ecmprojectbackend.webApi.route

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.domain.route.Route
import com.ecmprojectbackend.domain.route.RouteService
import com.ecmprojectbackend.webApi.route.representation.RouteRepresentation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("route")
class RouteController(
    private val routeService: RouteService
) {
    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody routeRepresentation: RouteRepresentation): Route {
        return routeService.save(Route(
            routeRepresentation.id,
            routeRepresentation.name,
            routeRepresentation.nameKey,
            routeRepresentation.content,
            ActivityType(
                routeRepresentation.activity,
                "",
                "",
                Page(null,
                    null,
                    "",
                    ""
                ),
                ProcessType(
                    null,
                    0,
                    null,
                    "",
                    "",
                    null,
                ),
                null,
                null
            ),
            ActivityType(
                routeRepresentation.nextActivity,
                "",
                "",
                Page(null,
                    null,
                    "",
                    ""
                ),
                ProcessType(
                    null,
                    0,
                    null,
                    "",
                    "",
                    null
                ),
                null,
                null
            )
        ))
    }

    @GetMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun get(): List<Route> {
        return routeService.getAll()
    }

    @DeleteMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun delete(@RequestParam routeId: String) {
        routeService.remove(Route(
            routeId,
            "",
            "",
            "",
            null,
            null
        ))
    }

}