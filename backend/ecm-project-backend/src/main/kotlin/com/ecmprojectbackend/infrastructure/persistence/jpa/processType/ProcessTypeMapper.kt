package com.ecmprojectbackend.infrastructure.persistence.jpa.processType

import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity


interface ProcessTypeMapper : Mapper<ProcessType, ProcessTypeEntity>