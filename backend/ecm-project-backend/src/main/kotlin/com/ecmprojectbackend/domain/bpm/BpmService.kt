package com.ecmprojectbackend.domain.bpm

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.domain.processType.ProcessType

interface BpmService {
    fun save(bpm: Bpm): ProcessType
}