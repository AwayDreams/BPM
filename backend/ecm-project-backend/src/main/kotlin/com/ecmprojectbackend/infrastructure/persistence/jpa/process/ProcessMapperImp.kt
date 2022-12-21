package com.ecmprojectbackend.infrastructure.persistence.jpa.process

import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.DataTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity.ProcessEntity
import org.springframework.stereotype.Service

@Service
class ProcessMapperImp(
    private val dataTypeMapper: DataTypeMapper
) : ProcessMapper {
    override fun fromModel(model: Process): ProcessEntity {
        return ProcessEntity(
            model.id,
            model.dataType?.let { dataTypeMapper.fromModel(it) },
            model.name,
            model.content
        )
    }

    override fun fromEntity(entity: ProcessEntity): Process {
        return Process(
            entity.id,
            entity.dataType?.let { dataTypeMapper.fromEntity(it) },
            entity.name,
            entity.content
        )
    }

}