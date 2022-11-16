package com.ecmprojectbackend.infrastructure.resources.db.migration.mapper

interface Mapper <TOrigin, TDestiny> {
    fun fromModel(model: TOrigin): TDestiny
    fun fromEntity(entity: TDestiny): TOrigin
}