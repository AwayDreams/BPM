package com.ecmprojectbackend.application.dataType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.dataType.DataTypeRepository
import com.ecmprojectbackend.domain.dataType.DataTypeService
import org.springframework.stereotype.Service

@Service
class DataTypeServiceImp(
    private val dataTypeRepository: DataTypeRepository
): DataTypeService {
    override fun save(dataType: DataType): DataType {
        return dataTypeRepository.save(dataType)
    }

    override fun getAll(): List<DataType> {
        return dataTypeRepository.getAll()
    }

    override fun get(dataTypeId: Long): DataType {
        return dataTypeRepository.get(dataTypeId)
    }

    override fun remove(dataType: DataType) {
        dataTypeRepository.remove(dataType)
    }

}