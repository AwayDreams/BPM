package com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType

import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.DataTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.entity.FieldTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import org.springframework.stereotype.Service


@Service
class FieldTypeMapperImp(
    private val dataTypeMapper: DataTypeMapper
) : FieldTypeMapper {
    override fun fromModel(model: FieldType): FieldTypeEntity {
        return FieldTypeEntity(
            model.id,
            model.dataType?.let { dataTypeMapper.fromModel(it) },
            model.name,
            model.type
        )
    }

    override fun fromEntity(entity: FieldTypeEntity): FieldType {
        return FieldType(
            entity.id,
            entity.dataType?.let { dataTypeMapper.fromEntity(it) },
            entity.name,
            entity.type
        )
    }

}