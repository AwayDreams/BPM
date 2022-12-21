package com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.entity

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[fieldtype]")
data class FieldTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "datatype")
    val dataType: DataTypeEntity?,
    @Column
    val name: String,
    @Column
    val type: String
        )