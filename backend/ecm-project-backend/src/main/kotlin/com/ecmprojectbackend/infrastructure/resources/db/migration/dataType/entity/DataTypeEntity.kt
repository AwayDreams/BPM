package com.ecmprojectbackend.infrastructure.resources.db.migration.dataType.entity

import javax.persistence.*

@Entity
@Table(name = "[datatype]")
data class DataTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @Column
    val Name: String
        )