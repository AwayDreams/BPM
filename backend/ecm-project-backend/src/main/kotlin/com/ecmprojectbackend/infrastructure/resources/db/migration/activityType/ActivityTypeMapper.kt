package com.ecmprojectbackend.infrastructure.resources.db.migration.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.infrastructure.resources.db.migration.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.resources.db.migration.mapper.Mapper

interface ActivityTypeMapper : Mapper<ActivityType, ActivityTypeEntity>