package com.ecmprojectbackend.webApi.FieldType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.domain.fieldType.fieldTypeService
import com.ecmprojectbackend.webApi.FieldType.representation.FieldTypeRepresentation
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("fieldtype")
class FieldTypeController(
    private val fieldTypeService: fieldTypeService
) {
    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody fieldTypeRepresentation: FieldTypeRepresentation): FieldType {
        return fieldTypeService.save(fieldTypeRepresentation.toModel())
    }

    @GetMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun get(@RequestParam dataTypeId: Long): List<FieldType> {
        return fieldTypeService.get(DataType(dataTypeId, null))
    }

    @DeleteMapping(path = ["/{fieldTypeId}"])
    fun remove(@PathVariable fieldTypeId: Long){
        fieldTypeService.remove(FieldType(fieldTypeId, null, "", ""))
    }
}