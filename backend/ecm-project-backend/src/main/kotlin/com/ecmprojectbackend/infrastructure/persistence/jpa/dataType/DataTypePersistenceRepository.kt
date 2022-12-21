package com.ecmprojectbackend.infrastructure.persistence.jpa.dataType

import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity

import org.springframework.data.jpa.repository.JpaRepository

interface DataTypePersistenceRepository: JpaRepository<DataTypeEntity, Long> {
}