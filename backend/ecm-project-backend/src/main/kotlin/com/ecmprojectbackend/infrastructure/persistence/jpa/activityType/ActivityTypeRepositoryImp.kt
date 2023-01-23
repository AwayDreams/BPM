package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.activityType.ActivityTypeRepository
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import org.springframework.stereotype.Repository

@Repository
class ActivityTypeRepositoryImp(
    private val activityTypeMapper: ActivityTypeMapper,
    private val activityTypePersistenceRepository: ActivityTypePersistenceRepository,
): ActivityTypeRepository {
    override fun save(activityType: ActivityType): ActivityType {
        return activityTypeMapper.fromEntity( activityTypePersistenceRepository.save( activityTypeMapper.fromModel(activityType)))
    }

    override fun getAll(): List<ActivityType> {
        return activityTypePersistenceRepository.findAll().map { activityTypeMapper.fromEntity(it) }
    }

    override fun remove(activityType: ActivityType) {
        return activityTypePersistenceRepository.delete( activityTypeMapper.fromModel(activityType))
    }

    override fun removeAll(processTypeId: Long) {
        return activityTypePersistenceRepository.deleteAllByProcessTypeId(processTypeId)
    }
}