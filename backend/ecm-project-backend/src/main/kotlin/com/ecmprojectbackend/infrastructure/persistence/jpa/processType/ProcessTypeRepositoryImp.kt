package com.ecmprojectbackend.infrastructure.persistence.jpa.processType

import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.domain.processType.ProcessTypeRepository
import org.springframework.stereotype.Repository

@Repository
class ProcessTypeRepositoryImp(
    private val processTypeMapper: ProcessTypeMapper,
    private val processTypePersistenceRepository: ProcessTypePersistenceRepository
): ProcessTypeRepository {
    override fun save(process: ProcessType): ProcessType {
        return processTypeMapper.fromEntity(processTypePersistenceRepository.save(processTypeMapper.fromModel(process)))
    }

    override fun getAll(): List<ProcessType> {
        return processTypePersistenceRepository.findAll().map { processTypeMapper.fromEntity(it) }
    }

    override fun get(processTypeId: Long): ProcessType {
        return processTypeMapper.fromEntity( processTypePersistenceRepository.findById(processTypeId).get() )
    }

    override fun remove(processType: ProcessType) {
        processTypePersistenceRepository.delete(processTypeMapper.fromModel(processType))
    }
}