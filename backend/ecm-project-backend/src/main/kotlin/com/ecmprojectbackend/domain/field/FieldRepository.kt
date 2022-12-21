package com.ecmprojectbackend.domain.field

interface FieldRepository {
    fun save(field: Field): Field
}