package com.ecmprojectbackend.domain.bpm

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.domain.route.Route


data class Bpm (
    val processType: ProcessType,
    val activityTypes: List<ActivityType>,
    val routes: List<Route>,
){
    constructor() : this(ProcessType(), listOf<ActivityType>(), listOf<Route>())
}