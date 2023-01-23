package com.ecmprojectbackend.webApi.bpm.representation


import com.ecmprojectbackend.webApi.activityType.representation.ActivityTypeRepresentation
import com.ecmprojectbackend.webApi.processType.representation.ProcessTypeRepresentation
import com.ecmprojectbackend.webApi.route.representation.RouteRepresentation

data class BpmRepresentation (
    val processType: ProcessTypeRepresentation,
    val activityTypes: List<ActivityTypeRepresentation>,
    val routes: List<RouteRepresentation>,
        ){
    constructor() : this(ProcessTypeRepresentation(), listOf<ActivityTypeRepresentation>(), listOf<RouteRepresentation>())
}