package com.ecmprojectbackend.domain.dataType

data class DataType (
    val id: Long?,
    val name: String?
        ){
    constructor(): this(null, null)
}