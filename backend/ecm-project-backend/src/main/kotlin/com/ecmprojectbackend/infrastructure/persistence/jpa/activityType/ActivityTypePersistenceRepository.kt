package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType

import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityTypePersistenceRepository: JpaRepository<ActivityTypeEntity, Long> {
}