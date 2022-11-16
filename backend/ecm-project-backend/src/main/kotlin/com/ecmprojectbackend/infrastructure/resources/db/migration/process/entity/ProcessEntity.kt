package com.ecmprojectbackend.infrastructure.resources.db.migration.process.entity

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.infrastructure.resources.db.migration.dataType.entity.DataTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[process]")
data class ProcessEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column
    val dataType: DataTypeEntity?,
    @Column
    val name: String,
    @Column
    val content: String
        )