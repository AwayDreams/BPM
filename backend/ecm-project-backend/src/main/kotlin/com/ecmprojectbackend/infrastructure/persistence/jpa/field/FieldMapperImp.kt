package com.ecmprojectbackend.infrastructure.persistence.jpa.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity.FieldEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.FieldTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.ProcessMapper
import org.springframework.stereotype.Service

@Service
class FieldMapperImp(
    private val fieldTypeMapper: FieldTypeMapper,
    private val processMapper: ProcessMapper
) : FieldMapper {
    override fun fromModel(model: Field): FieldEntity {
        return FieldEntity(
            model.id,
            model.fieldType?.let { fieldTypeMapper.fromModel(it) },
            model.process?.let { processMapper.fromModel(it) },
            model.value
        )
    }

    override fun fromEntity(entity: FieldEntity): Field {
        return Field(
            entity.id,
            entity.fieldType?.let { fieldTypeMapper.fromEntity(it) },
            entity.process?.let { processMapper.fromEntity(it) },
            entity.value
        )
    }
}