package com.ecmprojectbackend.application.route

import com.ecmprojectbackend.domain.route.Route
import com.ecmprojectbackend.domain.route.RouteRepository
import com.ecmprojectbackend.domain.route.RouteService
import org.springframework.stereotype.Service

@Service
class RouteServiceImp(
    private val routeRepository: RouteRepository
): RouteService {
    override fun save(route: Route): Route {
        return routeRepository.save(route)
    }

    override fun getAll(): List<Route> {
        return routeRepository.getAll()
    }

    override fun remove(route: Route) {
        return routeRepository.remove(route)
    }
}