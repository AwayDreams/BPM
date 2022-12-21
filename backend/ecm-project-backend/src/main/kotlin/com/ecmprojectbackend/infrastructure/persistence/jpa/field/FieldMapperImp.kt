package com.ecmprojectbackend.infrastructure.persistence.jpa.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.domain.fieldType.fieldTypeService
import com.ecmprojectbackend.infrastructure.persistence.jpa.activity.ActivityMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity.FieldEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.FieldTypeMapper
import org.springframework.stereotype.Service

@Service
class FieldMapperImp(
    private val fieldTypeMapper: FieldTypeMapper,
    private val activityMapper: ActivityMapper
) : FieldMapper {
    override fun fromModel(model: Field): FieldEntity {
        return FieldEntity(
            model.id,
            model.fieldType?.let { fieldTypeMapper.fromModel(model.fieldType) },
            model.activity?.let { activityMapper.fromModel(model.activity) },
            model.value
        )
    }

    override fun fromEntity(entity: FieldEntity): Field {
        return Field(
            entity.id,
            entity.fieldType?.let { fieldTypeMapper.fromEntity(entity.fieldType) },
            entity.activity?.let { activityMapper.fromEntity(entity.activity) },
            entity.value
        )
    }
}