package com.ecmprojectbackend.infrastructure.resources.db.migration.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.infrastructure.resources.db.migration.activityType.entity.ActivityTypeEntity


class ActivityTypeMapperImp : ActivityTypeMapper {
    override fun fromModel(model: ActivityType): ActivityTypeEntity {
       return  ActivityTypeEntity(
            model.id,
            model.type,
            model.name,
            model.page,
            model.process,
            model.activityGroupPermissions
       )
    }

    override fun fromEntity(entity: ActivityTypeEntity): ActivityType {
        TODO("Not yet implemented")
    }
}