package com.ecmprojectbackend.webApi.processType.representation

import com.ecmprojectbackend.domain.dataType.DataType

data class ProcessTypeRepresentation (
        val id: Long?,
        val version: Int,
        val dataTypeId: Long?,
        val name: String,
        val content: String,
        val firstActivityId: String?,
        ){
        constructor() : this(null, 0, null, "", "", null)
}