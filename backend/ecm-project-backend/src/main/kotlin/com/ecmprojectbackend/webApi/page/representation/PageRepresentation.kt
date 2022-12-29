package com.ecmprojectbackend.webApi.page.representation

import com.ecmprojectbackend.domain.dataType.DataType

class PageRepresentation (
    val id: Long?,
    val dataTypeId: Long?,
    val name: String,
    val content: String
) {
    constructor() : this(null, null, "", "")
}