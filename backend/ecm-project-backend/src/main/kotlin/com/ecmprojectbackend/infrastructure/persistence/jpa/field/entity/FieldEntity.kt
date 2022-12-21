package com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.infrastructure.persistence.jpa.activity.entity.ActivityEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.entity.FieldTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[field]")
data class FieldEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "[fieldtype]")
    val fieldType: FieldTypeEntity?,
    @ManyToOne
    @JoinColumn(name = "activity")
    val activity: ActivityEntity?,
    @Column
    val value: String,
        )