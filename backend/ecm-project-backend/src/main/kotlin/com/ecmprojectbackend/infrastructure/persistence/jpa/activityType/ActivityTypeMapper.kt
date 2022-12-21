package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import org.springframework.stereotype.Service

@Service
interface ActivityTypeMapper : Mapper<ActivityType, ActivityTypeEntity>