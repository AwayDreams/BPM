package com.ecmprojectbackend.domain.fieldType

import com.ecmprojectbackend.domain.dataType.DataType

interface fieldTypeService {
    fun save(fieldType: FieldType): FieldType

    fun get(dataType: DataType): List<FieldType>
    fun remove(fieldType: FieldType)
}