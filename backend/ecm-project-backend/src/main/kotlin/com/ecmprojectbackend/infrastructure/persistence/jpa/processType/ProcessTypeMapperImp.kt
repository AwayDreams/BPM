package com.ecmprojectbackend.infrastructure.persistence.jpa.processType

import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.ActivityTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.DataTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service

@Service
class ProcessTypeMapperImp(
    private val dataTypeMapper: DataTypeMapper,
) : ProcessTypeMapper {
    @Autowired
    @Lazy
    lateinit var activityTypeMapper: ActivityTypeMapper
    override fun fromModel(model: ProcessType): ProcessTypeEntity {
        return ProcessTypeEntity(
            model.id,
            model.version,
            model.dataType?.let { dataTypeMapper.fromModel(it) },
            model.name,
            model.content,
            model.firstActivity?.let { activityTypeMapper.fromModel(it) }
        )
    }

    override fun fromEntity(entity: ProcessTypeEntity): ProcessType {
        return ProcessType(
            entity.id,
            entity.version,
            entity.dataType?.let { dataTypeMapper.fromEntity(it) },
            entity.name,
            entity.content,
            entity.firstActivity?.let { activityTypeMapper.fromEntity(it) }
        )
    }

}