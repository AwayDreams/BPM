package com.ecmprojectbackend.domain.route

interface RouteRepository {
    fun save(route: Route): Route
    fun getAll(): List<Route>
    fun remove(route: Route)
}