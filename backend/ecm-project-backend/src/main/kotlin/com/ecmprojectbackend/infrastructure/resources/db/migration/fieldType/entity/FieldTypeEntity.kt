package com.ecmprojectbackend.infrastructure.resources.db.migration.fieldType.entity

import com.ecmprojectbackend.domain.dataType.DataType
import javax.persistence.*

@Entity
@Table(name = "[fieldtype]")
data class FieldTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @Column
    val dataType: DataType?,
    @Column
    val name: String,
    @Column
    val type: String
        )