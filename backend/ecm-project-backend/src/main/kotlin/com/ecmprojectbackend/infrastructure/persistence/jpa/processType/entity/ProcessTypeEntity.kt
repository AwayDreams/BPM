package com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[processtype]")
data class ProcessTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "datatype")
    val dataType: DataTypeEntity?,
    @Column
    val name: String,
    @Column
    val content: String
        )