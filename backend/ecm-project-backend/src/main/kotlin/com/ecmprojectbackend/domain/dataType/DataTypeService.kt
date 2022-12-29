package com.ecmprojectbackend.domain.dataType

import com.ecmprojectbackend.domain.fieldType.FieldType
import javax.xml.crypto.Data

interface DataTypeService {
    fun save(dataType: DataType): DataType
    fun getAll(): List<DataType>
    fun remove(dataType: DataType)
}