package com.ecmprojectbackend.infrastructure.persistence.jpa.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.domain.field.FieldRepository

class FieldRepositoryImp(
    private val fieldPersistenceRepository: FieldPersistenceRepository,
    private val fieldMapper: FieldMapper
): FieldRepository {

    override fun save(field: Field): Field {
        return fieldMapper.fromEntity(fieldPersistenceRepository.save( fieldMapper.fromModel(field)))
    }
}