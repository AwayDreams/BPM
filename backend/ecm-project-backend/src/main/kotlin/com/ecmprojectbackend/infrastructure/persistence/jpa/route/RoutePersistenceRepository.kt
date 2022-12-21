package com.ecmprojectbackend.infrastructure.persistence.jpa.route

import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.RouteEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RoutePersistenceRepository: JpaRepository<RouteEntity, Long> {
}