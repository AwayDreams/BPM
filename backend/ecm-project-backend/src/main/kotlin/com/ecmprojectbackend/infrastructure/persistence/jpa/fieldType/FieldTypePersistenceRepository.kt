package com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType

import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.entity.FieldTypeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FieldTypePersistenceRepository: JpaRepository<FieldTypeEntity, Long> {

}