package com.ecmprojectbackend.domain.process

import com.ecmprojectbackend.domain.dataType.DataType

data class Process (
    val id: Long?,
    val dataType: DataType?,
    val name: String,
    val content: String
        )