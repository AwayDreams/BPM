package com.ecmprojectbackend.webApi.activityType.representation

class ActivityTypeRepresentation (
    val id: String?,
    val name: String,
    val type: String,
    val pageId: Long?,
    val processTypeId: Long?,
    ){
    constructor() : this(null, "", "", null, null)
}