package com.ecmprojectbackend.domain.processType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.dataType.DataType

data class ProcessType (
    val id: Long?,
    val version: Int,
    val dataType: DataType?,
    val name: String,
    val content: String,
    var firstActivity: ActivityType?
        ){
    constructor(): this(null, 0, null, "", "", null)
}