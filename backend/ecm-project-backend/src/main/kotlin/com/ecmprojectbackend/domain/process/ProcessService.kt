package com.ecmprojectbackend.domain.process

interface ProcessService {
    fun save(process: Process): Process
    fun getAll(): List<Process>
    fun get(processId: Long): Process
    fun remove(process: Process)
}