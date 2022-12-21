package com.ecmprojectbackend.domain.activityType

interface ActivityTypeRepository {
    fun save(activityType: ActivityType): ActivityType
}