package com.ecmprojectbackend.domain.processType

interface ProcessTypeService {
    fun save(processType: Process): Process
    fun getAll(): List<Process>
    fun remove(processType: Process)
}