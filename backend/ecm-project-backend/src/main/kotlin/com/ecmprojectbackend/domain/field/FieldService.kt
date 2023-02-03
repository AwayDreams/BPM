package com.ecmprojectbackend.domain.field
import com.ecmprojectbackend.domain.process.Process

interface FieldService {
    fun save(field: Field): Field
    fun saveAll(fields: List<Field>): List<Field>
    fun getByProcess(process: Process): List<Field>
}