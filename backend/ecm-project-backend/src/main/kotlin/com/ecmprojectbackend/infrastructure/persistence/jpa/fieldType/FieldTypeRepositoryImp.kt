package com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.domain.fieldType.FieldTypeRepository
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.DataTypeMapper
import org.springframework.stereotype.Repository

@Repository
class FieldTypeRepositoryImp(
    private val fieldTypePersistenceRepository: FieldTypePersistenceRepository,
    private val fieldTypeMapper: FieldTypeMapper,
    private val dataTypeMapper: DataTypeMapper
): FieldTypeRepository {
    override fun save(fieldType: FieldType): FieldType {
        return fieldTypeMapper.fromEntity(fieldTypePersistenceRepository.save(fieldTypeMapper.fromModel(fieldType)))
    }

    override fun getByDataType(dataType: DataType): List<FieldType> {
        return fieldTypePersistenceRepository.findByDataType(dataTypeMapper.fromModel(dataType)).map { fieldTypeMapper.fromEntity(it) }
    }

    override fun remove(fieldType: FieldType) {
        return fieldTypePersistenceRepository.delete(fieldTypeMapper.fromModel(fieldType))
    }
}