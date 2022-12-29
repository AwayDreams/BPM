package com.ecmprojectbackend.domain.route

import com.ecmprojectbackend.domain.activityType.ActivityType

data class Route (
    val id: String?,
    val name: String,
    val nameKey: String,
    val content: String,
    val activity: ActivityType?,
    val nextActivity: ActivityType?
        )