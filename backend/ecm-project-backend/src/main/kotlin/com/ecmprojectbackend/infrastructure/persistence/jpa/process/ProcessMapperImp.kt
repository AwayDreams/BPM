package com.ecmprojectbackend.infrastructure.persistence.jpa.process

import com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity.ProcessEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.ActivityTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.ProcessTypeMapper
import org.springframework.stereotype.Service
import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.infrastructure.persistence.jpa.field.SimpleFieldMapper

@Service
class ProcessMapperImp(
    private val processTypeMapper: ProcessTypeMapper,
    private val activityTypeMapper: ActivityTypeMapper,
    private val simpleFieldMapper: SimpleFieldMapper
) : ProcessMapper {
    override fun fromModel(model: Process): ProcessEntity {
        return ProcessEntity(
            model.id,
            model.processType?.let { processTypeMapper.fromModel(it)  },
            model.activityType?.let { activityTypeMapper.fromModel(it) },
            model.fields?.map { simpleFieldMapper.fromModel(it) }
        )
    }

    override fun fromEntity(entity: ProcessEntity): Process {
        return Process(
            entity.id,
            entity.processType?.let { processTypeMapper.fromEntity(it)  },
            entity.activityType?.let { activityTypeMapper.fromEntity(it) },
            entity.fields?.map { simpleFieldMapper.fromEntity(it) }
        )
    }

}