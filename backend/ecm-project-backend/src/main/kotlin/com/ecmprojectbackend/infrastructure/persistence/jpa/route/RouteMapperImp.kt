package com.ecmprojectbackend.infrastructure.persistence.jpa.route

import com.ecmprojectbackend.domain.route.Route
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.ActivityTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.RouteEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service

@Service
class RouteMapperImp: RouteMapper {
    @Autowired
    @Lazy
    lateinit var activityTypeMapper: ActivityTypeMapper
    override fun fromModel(model: Route): RouteEntity {
        return RouteEntity(
            model.id,
            model.name,
            model.nameKey,
            model.content,
            model.activity?.let { activityTypeMapper.fromModel(it) },
            model.nextActivity?.let { activityTypeMapper.fromModel(it) }
        )
    }

    override fun fromEntity(entity: RouteEntity): Route {
        return Route(
            entity.id,
            entity.name,
            entity.nameKey,
            entity.content,
            entity.activity?.let { activityTypeMapper.fromEntity(it) },
            entity.nextActivity?.let { activityTypeMapper.fromEntity(it) }
        )
    }
}