package com.ecmprojectbackend.infrastructure.persistence.jpa.route

import com.ecmprojectbackend.domain.route.Route
import com.ecmprojectbackend.infrastructure.persistence.jpa.activity.ActivityMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.RouteEntity
import org.springframework.stereotype.Service

@Service
class RouteMapperImp(
    private val activityMapper: ActivityMapper
) : RouteMapper {
    override fun fromModel(model: Route): RouteEntity {
        return RouteEntity(
            model.id,
            model.name,
            model.nameKey,
            model.content,
            model.activity?.let { activityMapper.fromModel(it) },
            model.nextActivity?.let { activityMapper.fromModel(it) }
        )
    }

    override fun fromEntity(entity: RouteEntity): Route {
        return Route(
            entity.id,
            entity.name,
            entity.nameKey,
            entity.content,
            entity.activity?.let { activityMapper.fromEntity(it) },
            entity.nextActivity?.let { activityMapper.fromEntity(it) }
        )
    }
}