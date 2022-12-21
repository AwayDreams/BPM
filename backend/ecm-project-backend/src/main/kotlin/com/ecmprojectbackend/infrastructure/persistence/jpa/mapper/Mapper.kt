package com.ecmprojectbackend.infrastructure.persistence.jpa.mapper

interface Mapper <TOrigin, TDestiny> {
    fun fromModel(model: TOrigin): TDestiny
    fun fromEntity(entity: TDestiny): TOrigin
}