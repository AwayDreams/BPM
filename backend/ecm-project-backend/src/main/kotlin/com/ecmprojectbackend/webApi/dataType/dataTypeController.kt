package com.ecmprojectbackend.webApi.dataType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.dataType.DataTypeService
import com.ecmprojectbackend.domain.fieldType.FieldType
import com.ecmprojectbackend.webApi.FieldType.representation.FieldTypeRepresentation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("datatype")
class dataTypeController(
    private val dataTypeService: DataTypeService
) {

    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody dataType: DataType): DataType {
        return dataTypeService.save(dataType)
    }

    @GetMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun get(): List<DataType> {
        return dataTypeService.getAll()
    }

    @DeleteMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun delete(@RequestParam dataTypeId: Long) {
        dataTypeService.remove(DataType(dataTypeId, null))
    }
}