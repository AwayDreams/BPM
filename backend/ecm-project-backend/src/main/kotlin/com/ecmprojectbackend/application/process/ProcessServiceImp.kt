package com.ecmprojectbackend.application.process

import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.domain.process.ProcessRepository
import com.ecmprojectbackend.domain.process.ProcessService
import org.springframework.stereotype.Service

@Service
class ProcessServiceImp(
    private val processRepository: ProcessRepository,
): ProcessService {
    override fun save(processType: Process): Process {
        return processRepository.save(processType)
    }

    override fun getAll(): List<Process> {
        return processRepository.getAll()
    }

    override fun get(processId: Long): Process {
        return processRepository.get(processId)
    }

    override fun remove(process: Process) {
        return processRepository.remove(process)
    }
}