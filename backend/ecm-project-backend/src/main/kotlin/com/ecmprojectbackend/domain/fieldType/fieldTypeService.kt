package com.ecmprojectbackend.domain.fieldType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.user.User

interface fieldTypeService {
    fun save(fieldType: FieldType): FieldType

    fun get(dataType: DataType): List<FieldType>
    fun remove(fieldType: FieldType)
}