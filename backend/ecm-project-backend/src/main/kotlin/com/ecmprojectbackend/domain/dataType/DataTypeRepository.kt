package com.ecmprojectbackend.domain.dataType

interface DataTypeRepository {
    fun save(dataType: DataType): DataType
}