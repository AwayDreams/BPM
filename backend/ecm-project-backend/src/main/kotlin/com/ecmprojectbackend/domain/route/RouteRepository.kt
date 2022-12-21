package com.ecmprojectbackend.domain.route

interface RouteRepository {
    fun save(route: Route): Route
}