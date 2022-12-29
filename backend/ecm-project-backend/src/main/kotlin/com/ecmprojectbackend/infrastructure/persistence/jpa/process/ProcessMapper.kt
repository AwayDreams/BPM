package com.ecmprojectbackend.infrastructure.persistence.jpa.process

import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity.ProcessEntity
import com.ecmprojectbackend.domain.process.Process


interface ProcessMapper : Mapper<Process, ProcessEntity>