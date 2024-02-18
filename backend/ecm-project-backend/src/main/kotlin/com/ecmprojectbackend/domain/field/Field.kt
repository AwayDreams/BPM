package com.ecmprojectbackend.domain.field

import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.domain.process.Process
import lombok.NoArgsConstructor

@NoArgsConstructor
data class Field(
    val id: Long?,
    val fieldType: FieldType?,
    val process: Process?,
    val value: String
    ){
}