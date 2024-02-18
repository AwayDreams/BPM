package com.ecmprojectbackend.domain.page

import com.ecmprojectbackend.domain.dataType.DataType
import lombok.NoArgsConstructor

@NoArgsConstructor
data class Page (
    val id: Long?,
    val dataType: DataType?,
    val name: String,
    val content: String
        )