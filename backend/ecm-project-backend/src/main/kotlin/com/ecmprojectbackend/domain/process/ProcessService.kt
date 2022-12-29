package com.ecmprojectbackend.domain.process

interface ProcessService {
    fun save(processType: Process): Process
    fun getAll(): List<Process>
    fun remove(processType: Process)
}