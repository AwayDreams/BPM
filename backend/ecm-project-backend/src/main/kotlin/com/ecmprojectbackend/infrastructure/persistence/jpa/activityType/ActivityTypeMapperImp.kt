package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.GroupPermissionMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.page.PageMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.ProcessMapper
import org.springframework.stereotype.Service

@Service
class ActivityTypeMapperImp(
    private val groupPermissionMapper: GroupPermissionMapper,
    private val pageMapper: PageMapper,
    private val processMapper: ProcessMapper,
) : ActivityTypeMapper {
    override fun fromModel(model: ActivityType): ActivityTypeEntity {
        return  ActivityTypeEntity(
            model.id,
            model.type,
            model.name,
            model.page?.let { pageMapper.fromModel(it) },
            model.process?.let { processMapper.fromModel(it) },
            model.activityGroupPermissions?.let { it.map { groupPermissionMapper.fromModel(it) } }
       )
    }

    override fun fromEntity(entity: ActivityTypeEntity): ActivityType {
        return ActivityType(
            entity.id,
            entity.type,
            entity.name,
            entity.page?.let { pageMapper.fromEntity(it) },
            entity.process?.let { processMapper.fromEntity(it) },
            entity.activityGroupPermissions?.let { it.map { groupPermissionMapper.fromEntity(it) } }
        )
    }
}