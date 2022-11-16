package com.ecmprojectbackend.infrastructure.resources.db.migration.fieldType

import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.infrastructure.resources.db.migration.fieldType.entity.FieldTypeEntity
import com.ecmprojectbackend.infrastructure.resources.db.migration.mapper.Mapper

interface FieldTypeMapper : Mapper<FieldType, FieldTypeEntity>