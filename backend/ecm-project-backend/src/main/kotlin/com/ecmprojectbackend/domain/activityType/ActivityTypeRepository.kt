package com.ecmprojectbackend.domain.activityType

import com.ecmprojectbackend.domain.dataType.DataType

interface ActivityTypeRepository {
    fun save(activityType: ActivityType): ActivityType
    fun getAll(): List<ActivityType>
    fun remove(activityType: ActivityType)
}