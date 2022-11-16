package com.ecmprojectbackend.infrastructure.resources.db.migration.dataType.entity

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.infrastructure.resources.db.migration.mapper.Mapper


interface DataTypeMapper : Mapper<DataType, DataTypeEntity>