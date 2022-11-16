package com.ecmprojectbackend.infrastructure.resources.db.migration.fieldType

import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.infrastructure.resources.db.migration.fieldType.entity.FieldTypeEntity
import com.ecmprojectbackend.infrastructure.resources.db.migration.mapper.Mapper


class FieldTypeMapperImp : Mapper<FieldType, FieldTypeEntity> {
    override fun fromModel(model: FieldType): FieldTypeEntity {
        return FieldTypeEntity(
            model.id,
            model.dataType,
            model.name,
            model.type,
            model.type,
            m
        )
    }

    override fun fromEntity(entity: FieldTypeEntity): FieldType {
        TODO("Not yet implemented")
    }

}