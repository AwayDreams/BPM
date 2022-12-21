package com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType

import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.entity.FieldTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import org.springframework.stereotype.Service


interface FieldTypeMapper : Mapper<FieldType, FieldTypeEntity>