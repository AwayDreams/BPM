package com.ecmprojectbackend.infrastructure.resources.db.migration.dataType.entity

import com.ecmprojectbackend.domain.dataType.DataType

class DataTypeMapperImp : DataTypeMapper {
    override fun fromModel(model: DataType): DataTypeEntity {
        return DataTypeEntity(
            model.id,
            model.Name
        )
    }

    override fun fromEntity(entity: DataTypeEntity): DataType {
        return DataType(
            entity.id,
            entity.Name
        )
    }
}