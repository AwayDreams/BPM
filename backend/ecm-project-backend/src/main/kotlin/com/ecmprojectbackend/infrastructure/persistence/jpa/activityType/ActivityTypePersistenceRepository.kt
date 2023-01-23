package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType

import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityTypePersistenceRepository: JpaRepository<ActivityTypeEntity, Long> {
    fun deleteAllByProcessTypeId(processTypeId: Long)
}