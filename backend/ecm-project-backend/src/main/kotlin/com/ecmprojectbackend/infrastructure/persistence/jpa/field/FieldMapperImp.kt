package com.ecmprojectbackend.infrastructure.persistence.jpa.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.ActivityTypeMapper
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
            model.fieldType?.let { fieldTypeMapper.fromModel(model.fieldType) },
            model.process?.let { processMapper.fromModel(model.process) },
            model.value
        )
    }

    override fun fromEntity(entity: FieldEntity): Field {
        return Field(
            entity.id,
            entity.fieldType?.let { fieldTypeMapper.fromEntity(entity.fieldType) },
            entity.process?.let { processMapper.fromEntity(entity.process) },
            entity.value
        )
    }
}