package com.ecmprojectbackend.domain.processType

interface ProcessRepository {
    fun save(processType: Process): Process
    fun getAll(): List<Process>
    fun remove(processType: Process)
}