package com.ecmprojectbackend.webApi.field.representation

import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.domain.process.Process

data class FieldRepresentation (
    val id: Long?,
    val fieldTypeId: Long?,
    val processId: Long?,
    val value: String
){
    constructor():  this(null, null, null, "")
}