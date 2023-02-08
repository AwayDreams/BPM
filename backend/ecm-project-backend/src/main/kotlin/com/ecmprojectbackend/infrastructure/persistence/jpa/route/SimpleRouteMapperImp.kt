package com.ecmprojectbackend.infrastructure.persistence.jpa.route

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.route.Route
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.ActivityTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.RouteEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.SimpleRouteEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service

@Service
class SimpleRouteMapperImp: SimpleRouteMapper {
    @Autowired
    @Lazy
    lateinit var activityTypeMapper: ActivityTypeMapper
    override fun fromModel(model: Route): SimpleRouteEntity {
        return SimpleRouteEntity(
            model.id,
            model.name,
            model.nameKey,
            model.content,
            model.activity?.id,
            model.nextActivity?.id
        )
    }

    override fun fromEntity(entity: SimpleRouteEntity): Route {
        return Route(
            entity.id,
            entity.name,
            entity.nameKey,
            entity.content,
            ActivityType(
                entity.activityId,
                "",
                "",
                null,
                null,
                null,
                null
            ),
            ActivityType(
                entity.nextActivityId,
                "",
                "",
                null,
                null,
                null,
                null
            )
        )
    }
}