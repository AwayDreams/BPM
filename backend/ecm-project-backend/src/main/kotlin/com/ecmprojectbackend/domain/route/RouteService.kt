package com.ecmprojectbackend.domain.route

interface RouteService {
    fun save(route: Route): Route
    fun getAll(): List<Route>
    fun remove(route: Route)
}