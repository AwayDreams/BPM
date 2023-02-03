package com.ecmprojectbackend.application.field

import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.domain.field.FieldRepository
import com.ecmprojectbackend.domain.field.FieldService
import com.ecmprojectbackend.domain.process.Process
import org.springframework.stereotype.Service

@Service
class fieldServiceImp(
    private val fieldRepository: FieldRepository
): FieldService {
    override fun save(field: Field): Field {
        return fieldRepository.save(field)
    }

    override fun saveAll(fields: List<Field>): List<Field> {
        return fieldRepository.saveAll(fields)
    }

    override fun getByProcess(process: Process): List<Field> {
        return fieldRepository.getByProcess(process);
    }

}