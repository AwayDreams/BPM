package com.ecmprojectbackend.domain.field

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.domain.fieldType.FieldType

data class Field(
    val fieldType: FieldType?,
    val activity: Activity?,
    val value: String,
    )