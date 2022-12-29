package com.ecmprojectbackend.domain.processType

import com.ecmprojectbackend.domain.dataType.DataType

data class ProcessType (
    val id: Long?,
    val dataType: DataType?,
    val name: String,
    val content: String
        )