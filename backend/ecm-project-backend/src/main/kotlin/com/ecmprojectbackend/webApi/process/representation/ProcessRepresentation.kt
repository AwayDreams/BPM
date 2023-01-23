package com.ecmprojectbackend.webApi.process.representation


data class ProcessRepresentation (
    val id: Long?,
    val processTypeId: Long?,
    val activityTypeId: String?
        ){
    constructor() : this(null, null ,null)
}