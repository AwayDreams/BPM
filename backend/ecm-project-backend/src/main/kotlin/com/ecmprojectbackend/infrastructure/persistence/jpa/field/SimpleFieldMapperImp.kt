package com.ecmprojectbackend.infrastructure.persistence.jpa.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity.FieldEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity.SimpleFieldEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.FieldTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.ProcessMapper
import org.springframework.stereotype.Service

@Service
class SimpleFieldMapperImp(
    private val fieldTypeMapper: FieldTypeMapper
) : SimpleFieldMapper {
    override fun fromModel(model: Field): SimpleFieldEntity {
        return SimpleFieldEntity(
            model.id,
            model.fieldType?.let { fieldTypeMapper.fromModel(it) },
            model.process?.let { it.id },
            model.value
        )
    }

    override fun fromEntity(entity: SimpleFieldEntity): Field {
        return Field(
            entity.id,
            entity.fieldType?.let { fieldTypeMapper.fromEntity(it) },
            if(entity.processId == null) null else Process(
                entity.processId,
                null,
                null,
                null
            ),
            entity.value
        )
    }
}