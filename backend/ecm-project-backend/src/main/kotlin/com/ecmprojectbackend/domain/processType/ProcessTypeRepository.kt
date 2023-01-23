package com.ecmprojectbackend.domain.processType

interface ProcessTypeRepository {
    fun save(processType: ProcessType): ProcessType
    fun getAll(): List<ProcessType>
    fun get(processTypeId: Long): ProcessType
    fun remove(processType: ProcessType)
}