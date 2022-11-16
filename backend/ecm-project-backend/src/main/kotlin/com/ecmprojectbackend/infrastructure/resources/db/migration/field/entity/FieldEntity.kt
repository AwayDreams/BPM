package com.ecmprojectbackend.infrastructure.resources.db.migration.field.entity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.domain.fieldType.FieldType
import javax.persistence.*

@Entity
@Table(name = "[field]")
data class FieldEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val fieldType: FieldType?,
    @Column
    val activity: Activity?,
    @Column
    val value: String,
        )