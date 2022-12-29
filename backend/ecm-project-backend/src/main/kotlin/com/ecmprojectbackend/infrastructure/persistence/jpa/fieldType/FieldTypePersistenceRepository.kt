package com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.entity.FieldTypeEntity
import org.springframework.data.jpa.repository.JpaRepository
import javax.xml.crypto.Data

interface FieldTypePersistenceRepository: JpaRepository<FieldTypeEntity, Long> {
    fun findByDataType(dataTypeEntity: DataTypeEntity): List<FieldTypeEntity>
}