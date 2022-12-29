package com.ecmprojectbackend.infrastructure.persistence.jpa.process

import com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity.ProcessEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProcessPersistenceRepository: JpaRepository<ProcessEntity, Long> {
}