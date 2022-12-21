package com.ecmprojectbackend.infrastructure.persistence.jpa.dataType

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper


interface DataTypeMapper : Mapper<DataType, DataTypeEntity>