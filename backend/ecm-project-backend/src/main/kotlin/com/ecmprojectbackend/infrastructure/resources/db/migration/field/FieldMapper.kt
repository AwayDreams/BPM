package com.ecmprojectbackend.infrastructure.resources.db.migration.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.infrastructure.resources.db.migration.field.entity.FieldEntity
import com.ecmprojectbackend.infrastructure.resources.db.migration.mapper.Mapper

interface FieldMapper : Mapper<Field, FieldEntity>