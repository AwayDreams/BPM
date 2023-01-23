package com.ecmprojectbackend.infrastructure.persistence.jpa.route

import com.ecmprojectbackend.domain.route.Route
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.RouteEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.SimpleRouteEntity


interface SimpleRouteMapper : Mapper<Route, SimpleRouteEntity>