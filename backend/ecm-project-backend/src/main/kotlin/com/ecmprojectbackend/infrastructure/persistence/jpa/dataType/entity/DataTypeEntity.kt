package com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity

import javax.persistence.*

@Entity
@Table(name = "[datatype]")
data class DataTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @Column
    val name: String?
        ){
    constructor() : this(null, null)
}