package com.ecmprojectbackend.domain.process

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.domain.processType.ProcessType

data class Process (
    val id: Long?,
    val processType: ProcessType?,
    val activityType: ActivityType?,
    val fields: List<Field>?,
        ){
    constructor(): this(null, null, null, null)
}