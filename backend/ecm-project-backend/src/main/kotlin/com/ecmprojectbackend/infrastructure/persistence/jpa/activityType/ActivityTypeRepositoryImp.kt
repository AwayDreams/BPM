package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.activityType.ActivityTypeRepository
import org.springframework.stereotype.Repository

@Repository
class ActivityTypeRepositoryImp(
    private val activityTypeMapperImp: ActivityTypeMapperImp,
    private val activityTypePersistenceRepository: ActivityTypePersistenceRepository,
): ActivityTypeRepository {
    override fun save(activityType: ActivityType): ActivityType {
        return activityTypeMapperImp.fromEntity( activityTypePersistenceRepository.save( activityTypeMapperImp.fromModel(activityType)))
    }
}