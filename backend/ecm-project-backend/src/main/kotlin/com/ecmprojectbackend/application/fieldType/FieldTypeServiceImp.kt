package com.ecmprojectbackend.application.fieldType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.domain.fieldType.FieldTypeRepository
import com.ecmprojectbackend.domain.fieldType.fieldTypeService
import org.springframework.stereotype.Service

@Service
class FieldTypeServiceImp(
    private val fieldTypeRepository: FieldTypeRepository
) : fieldTypeService {
    override fun save(fieldType: FieldType): FieldType {
        return fieldTypeRepository.save(fieldType)
    }

    override fun get(dataType: DataType): List<FieldType> {
        return fieldTypeRepository.getByDataType(dataType)
    }
    override fun remove(fieldType: FieldType) {
        fieldTypeRepository.remove(fieldType)
    }

}