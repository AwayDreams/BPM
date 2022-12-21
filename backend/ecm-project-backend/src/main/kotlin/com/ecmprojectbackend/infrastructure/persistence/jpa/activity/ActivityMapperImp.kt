package com.ecmprojectbackend.infrastructure.persistence.jpa.activity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.infrastructure.persistence.jpa.activity.entity.ActivityEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.ActivityTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.user.UserMapper
import org.springframework.stereotype.Service

@Service
class ActivityMapperImp(
    private val userMapper: UserMapper,
    private val activityTypeMapper: ActivityTypeMapper
) : ActivityMapper {
    override fun fromModel(model: Activity): ActivityEntity {
        return ActivityEntity(
            model.id,
            model.user?.let { userMapper.fromModel(model.user) },
            model.activityType?.let { activityTypeMapper.fromModel(model.activityType) }
        )
    }

    override fun fromEntity(entity: ActivityEntity): Activity {
        return Activity(
            entity.id,
            entity.user?.let { userMapper.fromEntity(entity.user) },
            entity.activityType?.let { activityTypeMapper.fromEntity(entity.activityType) }
        )
    }

}