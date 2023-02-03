package com.ecmprojectbackend.infrastructure.persistence.jpa.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.domain.field.FieldRepository
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.ProcessMapper
import org.springframework.stereotype.Repository

@Repository
class FieldRepositoryImp(
    private val fieldPersistenceRepository: FieldPersistenceRepository,
    private val fieldMapper: FieldMapper,
    private val processMapper: ProcessMapper
): FieldRepository {

    override fun save(field: Field): Field {
        return fieldMapper.fromEntity(fieldPersistenceRepository.save( fieldMapper.fromModel(field)))
    }

    override fun saveAll(fields: List<Field>): List<Field> {
        val fieldEntities =  fields.map { fieldMapper.fromModel(it) }
        return fieldPersistenceRepository.saveAll(fieldEntities).map { fieldMapper.fromEntity(it) }
    }

    override fun getByProcess(process: Process): List<Field> {
        return fieldPersistenceRepository.findByProcess(processMapper.fromModel(process)).map { fieldMapper.fromEntity(it) }
    }
}