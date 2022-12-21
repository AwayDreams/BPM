package com.ecmprojectbackend.infrastructure.persistence.jpa.process

import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity.ProcessEntity


interface ProcessMapper : Mapper<Process, ProcessEntity>