package com.ecmprojectbackend.domain.activityType

import com.ecmprojectbackend.domain.dataType.DataType

interface ActivityTypeService {
    fun save(activityType: ActivityType): ActivityType
    fun getAll(): List<ActivityType>
    fun remove(activityType: ActivityType)
    fun removeAll(processTypeId: Long)
}