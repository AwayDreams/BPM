package com.ecmprojectbackend.infrastructure.persistence.jpa.processType

import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProcessTypePersistenceRepository: JpaRepository<ProcessTypeEntity, Long> {
}