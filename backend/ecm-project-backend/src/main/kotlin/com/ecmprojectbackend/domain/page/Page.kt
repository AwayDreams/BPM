package com.ecmprojectbackend.domain.page

import com.ecmprojectbackend.domain.dataType.DataType

data class Page (
    val id: Long?,
    val dataType: DataType?,
    val name: String,
    val content: String
        )