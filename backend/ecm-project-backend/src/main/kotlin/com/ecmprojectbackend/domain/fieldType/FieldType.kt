package com.ecmprojectbackend.domain.fieldType

import com.ecmprojectbackend.domain.dataType.DataType

data class FieldType (
    val id: Long?,
    val dataType: DataType?,
    val name: String,
    val type: String
        )