package com.ecmprojectbackend.domain.dataType

interface DataTypeRepository {
    fun save(dataType: DataType): DataType
    fun getAll(): List<DataType>
    fun remove(dataType: DataType)
}