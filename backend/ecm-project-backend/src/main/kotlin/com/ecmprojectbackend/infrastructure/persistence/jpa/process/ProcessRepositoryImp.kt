package com.ecmprojectbackend.infrastructure.persistence.jpa.process

import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.domain.process.ProcessRepository
import org.springframework.stereotype.Repository

@Repository
class ProcessRepositoryImp(
    private val processMapper: ProcessMapper,
    private val processPersistenceRepository: ProcessPersistenceRepository
): ProcessRepository {
    override fun save(process: Process): Process {
        return processMapper.fromEntity(processPersistenceRepository.save(processMapper.fromModel(process)))
    }

    override fun getAll(): List<Process> {
        return processPersistenceRepository.findAll().map { processMapper.fromEntity(it) }
    }

    override fun get(processId: Long): Process {
        return processMapper.fromEntity( processPersistenceRepository.findById(processId).get() )
    }

    override fun remove(process: Process) {
        processPersistenceRepository.delete(processMapper.fromModel(process))
    }
}