package com.ecmprojectbackend.infrastructure.persistence.jpa.route

import com.ecmprojectbackend.domain.route.Route
import com.ecmprojectbackend.domain.route.RouteRepository
import org.springframework.stereotype.Repository

@Repository
class RouteRepositoryImp(
    private val routeMapper: RouteMapper,
    private val routePersistenceRepository: RoutePersistenceRepository
): RouteRepository {

    override fun save(route: Route): Route {
        return routeMapper.fromEntity(routePersistenceRepository.save(routeMapper.fromModel(route)))
    }
}