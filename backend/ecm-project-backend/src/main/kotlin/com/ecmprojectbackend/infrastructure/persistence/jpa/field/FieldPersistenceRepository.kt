package com.ecmprojectbackend.infrastructure.persistence.jpa.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity.FieldEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity.ProcessEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.user.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FieldPersistenceRepository: JpaRepository<FieldEntity, Long> {

    fun findByProcess(processEntity: ProcessEntity): List<FieldEntity>
}