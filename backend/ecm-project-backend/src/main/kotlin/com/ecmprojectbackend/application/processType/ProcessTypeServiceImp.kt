package com.ecmprojectbackend.application.processType

import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.domain.processType.ProcessTypeRepository
import com.ecmprojectbackend.domain.processType.ProcessTypeService
import org.springframework.stereotype.Service

@Service
class ProcessTypeServiceImp(
    private val processTypeRepository: ProcessTypeRepository,
): ProcessTypeService {
    override fun save(processType: ProcessType): ProcessType {
        return processTypeRepository.save(processType)
    }

    override fun getAll(): List<ProcessType> {
        return processTypeRepository.getAll()
    }

    override fun get(processTypeId: Long): ProcessType {
        return processTypeRepository.get(processTypeId)
    }

    override fun remove(processType: ProcessType) {
        return processTypeRepository.remove(processType)
    }
}