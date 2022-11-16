package com.ecmprojectbackend.infrastructure.resources.db.migration.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.infrastructure.resources.db.migration.field.entity.FieldEntity

class FieldMapperImp : FieldMapper{
    override fun fromModel(model: Field): FieldEntity {
        return FieldEntity(
            model.fieldType,
            model.activity,
            model.value
        )
    }

    override fun fromEntity(entity: FieldEntity): Field {
        return Field(
            entity.fieldType,
            entity.activity,
            entity.value
        )
    }
}