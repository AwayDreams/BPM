package com.ecmprojectbackend.infrastructure.persistence.jpa.activity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.domain.activity.ActivityRepository
import org.springframework.stereotype.Repository

@Repository
class ActivityRepositoryImp(
    private val activityMapper: ActivityMapper,
    private val activityPersistenceRepository: ActivityPersistenceRepository
) : ActivityRepository  {
    override fun save(activity: Activity): Activity {
        return activityMapper.fromEntity( activityPersistenceRepository.save( activityMapper.fromModel(activity)))
    }
}