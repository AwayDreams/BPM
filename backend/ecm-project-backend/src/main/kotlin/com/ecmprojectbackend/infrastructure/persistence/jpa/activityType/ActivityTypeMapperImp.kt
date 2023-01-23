package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.GroupPermissionMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.page.PageMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.ProcessTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.RouteMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.SimpleRouteMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivityTypeMapperImp(
    private val groupPermissionMapper: GroupPermissionMapper,
    private val pageMapper: PageMapper,
) : ActivityTypeMapper {
    @Autowired
    @org.springframework.context.annotation.Lazy
    lateinit var processTypeMapper: ProcessTypeMapper

    @Autowired
    @org.springframework.context.annotation.Lazy
    lateinit var simpleRouteMapper: SimpleRouteMapper

    override fun fromModel(model: ActivityType): ActivityTypeEntity {
        return  ActivityTypeEntity(
            model.id,
            model.name,
            model.type,
            model.page?.let { pageMapper.fromModel(it) },
            model.processType?.id,
            model.routes?.let { model.routes.map { simpleRouteMapper.fromModel(it) } },
            model.activityGroupPermissions?.let { it.map { groupPermissionMapper.fromModel(it) } }
       )
    }

    override fun fromEntity(entity: ActivityTypeEntity): ActivityType {
        return ActivityType(
            entity.id,
            entity.name,
            entity.type,
            entity.page?.let { pageMapper.fromEntity(it) },
            ProcessType(
                entity.processTypeId,
                0,
                null,
                "",
                "",
                null
            ),
            entity.routes?.let { entity.routes.map { simpleRouteMapper.fromEntity(it) } },
            entity.activityGroupPermissions?.let { it.map { groupPermissionMapper.fromEntity(it) } }
        )
    }
}