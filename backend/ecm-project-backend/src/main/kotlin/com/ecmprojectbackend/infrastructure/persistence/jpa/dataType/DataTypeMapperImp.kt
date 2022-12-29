package com.ecmprojectbackend.infrastructure.persistence.jpa.dataType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import org.springframework.stereotype.Service

@Service
class DataTypeMapperImp : DataTypeMapper {
    override fun fromModel(model: DataType): DataTypeEntity {
        return DataTypeEntity(
            model.id,
            model.name
        )
    }

    override fun fromEntity(entity: DataTypeEntity): DataType {
        return DataType(
            entity.id,
            entity.name
        )
    }
}