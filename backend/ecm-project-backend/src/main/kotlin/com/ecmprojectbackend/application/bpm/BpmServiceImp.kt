package com.ecmprojectbackend.application.bpm

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.domain.activityType.ActivityTypeService
import com.ecmprojectbackend.domain.bpm.Bpm
import com.ecmprojectbackend.domain.bpm.BpmService
import com.ecmprojectbackend.domain.dataType.DataTypeService
import com.ecmprojectbackend.domain.field.Field
import com.ecmprojectbackend.domain.field.FieldService
import com.ecmprojectbackend.domain.fieldType.fieldTypeService
import com.ecmprojectbackend.domain.process.Process
import com.ecmprojectbackend.domain.process.ProcessService
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
    private val fieldTypeService: fieldTypeService,
    private val fieldService: FieldService,
    private val processService: ProcessService
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

    override fun iniciarProcesso(processTypeId: Long): Process {
        val processType = processTypeService.get(processTypeId);
        val process = processService.save(
            Process(
                null,
                processType,
                processType.firstActivity,
                null
            )
        )

        val fieldTypes = fieldTypeService.get(processType.dataType!!)

        fieldTypes.forEach { fieldService.save(
            Field(
                null,
                it,
                process,
                ""
            )
        ) }

        return process;
    }

}