package com.ecmprojectbackend.application.bpm

import com.ecmprojectbackend.domain.activityType.ActivityTypeService
import com.ecmprojectbackend.domain.bpm.Bpm
import com.ecmprojectbackend.domain.bpm.BpmService
import com.ecmprojectbackend.domain.processType.ProcessType
import com.ecmprojectbackend.domain.processType.ProcessTypeService
import com.ecmprojectbackend.domain.route.RouteService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class BpmServiceImp(
    private val processTypeService: ProcessTypeService,
    private val activityTypeService: ActivityTypeService,
    private val routeService: RouteService,
): BpmService {
    override fun save(bpm: Bpm): ProcessType {
        bpm.processType.id?.let { activityTypeService.removeAll(it) }

        val firstActivity = bpm.processType.firstActivity
        bpm.processType.firstActivity = null

        val processType = processTypeService.save(bpm.processType)

        bpm.activityTypes.forEach { activityTypeService.save(it)  }
        bpm.routes.forEach { routeService.save(it)  }

        processType.firstActivity = firstActivity

        processTypeService.save(processType)
        return processType
    }
}