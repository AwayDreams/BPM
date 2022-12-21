package com.ecmprojectbackend.infrastructure.persistence.jpa.dataType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.dataType.DataTypeRepository
import org.springframework.stereotype.Repository

@Repository
class DataTypeRepositoryImp(
    private val dataTypeMapper: DataTypeMapper,
    private val dataTypePersistenceRepository: DataTypePersistenceRepository
): DataTypeRepository {

    override fun save(dataType: DataType): DataType {
        return dataTypeMapper.fromEntity( dataTypePersistenceRepository.save( dataTypeMapper.fromModel(dataType)))
    }
}