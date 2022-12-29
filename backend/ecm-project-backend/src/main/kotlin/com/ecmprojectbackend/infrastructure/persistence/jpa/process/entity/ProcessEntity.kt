package com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity

import com.ecmprojectbackend.domain.activityType.ActivityType
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[process]")
data class ProcessEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "processtype")
    val processType: ProcessTypeEntity?,
    @ManyToOne
    @JoinColumn(name = "activitytype")
    val activityType: ActivityTypeEntity?
        )