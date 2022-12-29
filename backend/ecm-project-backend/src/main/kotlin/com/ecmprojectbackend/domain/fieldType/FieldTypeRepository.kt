package com.ecmprojectbackend.domain.fieldType

import com.ecmprojectbackend.domain.dataType.DataType

interface FieldTypeRepository {
    fun save(fieldType: FieldType): FieldType
    fun getByDataType(dataType: DataType): List<FieldType>
    fun remove(fieldType: FieldType)
}