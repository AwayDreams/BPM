package com.ecmprojectbackend.application.activityType

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.activityType.ActivityTypeRepository
import com.ecmprojectbackend.domain.activityType.ActivityTypeService
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.ActivityTypeMapper
import org.springframework.stereotype.Service

@Service
class ActivityTypeServiceImp(
    private val activityTypeRepository: ActivityTypeRepository,
    private val activityTypeMapper: ActivityTypeMapper
): ActivityTypeService {
    override fun save(activityType: ActivityType): ActivityType {
        return activityTypeRepository.save(activityType)
    }

    override fun getAll(): List<ActivityType> {
        return activityTypeRepository.getAll()
    }

    override fun remove(activityType: ActivityType) {
        return activityTypeRepository.remove(activityType)
    }

    override fun removeAll(processTypeId: Long) {
        return activityTypeRepository.removeAll(processTypeId)
    }
}