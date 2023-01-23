package com.ecmprojectbackend.domain.processType

interface ProcessTypeService {
    fun save(processType: ProcessType): ProcessType
    fun getAll(): List<ProcessType>
    fun get(processTypeId: Long): ProcessType
    fun remove(processType: ProcessType)
}