package com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[process]")
data class ProcessEntity (
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