package com.ecmprojectbackend.domain.route

import com.ecmprojectbackend.domain.activity.Activity

data class Route (
    val id: Long?,
    val name: String,
    val nameKey: String,
    val content: String,
    val activity: Activity?,
    val nextActivity: Activity?
        )