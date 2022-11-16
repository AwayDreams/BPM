package com.ecmprojectbackend.infrastructure.resources.db.migration.activity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.infrastructure.resources.db.migration.activity.entity.ActivityEntity

class ActivityMapperImp : ActivityMapper {
    override fun fromModel(model: Activity): ActivityEntity {
        return ActivityEntity(
            model.id,
            model.user,
        )
    }

    override fun fromEntity(entity: ActivityEntity): Activity {
        return Activity(
            entity.id,
            entity.user,
        )
    }

}