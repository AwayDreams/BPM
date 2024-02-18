package com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity.SimpleFieldEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[process]")
@NoArgsConstructor
data class ProcessEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "processtype")
    val processType: ProcessTypeEntity?,
    @ManyToOne
    @JoinColumn(name = "activitytype")
    val activityType: ActivityTypeEntity?,
    @OneToMany
    @JoinColumn(name = "process")
    val fields: List<SimpleFieldEntity>?,
        ){
}