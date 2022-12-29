package com.ecmprojectbackend.webApi.FieldType.representation

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.domain.user.User

data class FieldTypeRepresentation (
        val id: Long?,
        val dataTypeId: Long?,
        val name: String,
        val type: String
        ){
        constructor() : this(null, null, "", "")

        fun toModel(): FieldType {
                return FieldType(
                        id,
                        DataType(dataTypeId, null),
                        name,
                        type
                )
        }
}

