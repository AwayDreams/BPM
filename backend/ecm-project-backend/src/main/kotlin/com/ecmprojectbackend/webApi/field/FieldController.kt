package com.ecmprojectbackend.webApi.field

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.domain.process.Process

import com.ecmprojectbackend.domain.field.FieldService
import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.webApi.field.representation.FieldRepresentation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("field")
class FieldController(
    private val fieldService: FieldService
) {

    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun saveAll(@RequestBody fields: List<Field>): List<Field> {
        return fieldService.saveAll(fields)
    }

    @GetMapping(path = ["/{processId}"], produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun getByProcess(@PathVariable processId: Long): List<Field>  {
        return fieldService.getByProcess(Process(
            processId,
            null,
            null,
            null
        ))
    }
}