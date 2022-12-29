package com.ecmprojectbackend.webApi.route.representation


class RouteRepresentation (
    val id: String?,
    val name: String,
    val nameKey: String,
    val content: String,
    val activity: String?,
    val nextActivity: String?
) {
    constructor() : this(null, "", "", "", null, null)
}