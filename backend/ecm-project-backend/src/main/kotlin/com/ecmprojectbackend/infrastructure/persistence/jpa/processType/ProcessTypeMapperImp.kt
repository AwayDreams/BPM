package com.ecmprojectbackend.infrastructure.persistence.jpa.processType

import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.DataTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import org.springframework.stereotype.Service

@Service
class ProcessTypeMapperImp(
    private val dataTypeMapper: DataTypeMapper
) : ProcessTypeMapper {
    override fun fromModel(model: ProcessType): ProcessTypeEntity {
        return ProcessTypeEntity(
            model.id,
            model.dataType?.let { dataTypeMapper.fromModel(it) },
            model.name,
            model.content
        )
    }

    override fun fromEntity(entity: ProcessTypeEntity): ProcessType {
        return ProcessType(
            entity.id,
            entity.dataType?.let { dataTypeMapper.fromEntity(it) },
            entity.name,
            entity.content
        )
    }

}