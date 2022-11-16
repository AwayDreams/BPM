package com.ecmprojectbackend.infrastructure.resources.db.migration.page.entity

import com.ecmprojectbackend.domain.dataType.DataType
import com.ecmprojectbackend.infrastructure.resources.db.migration.dataType.entity.DataTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[page]")
data class PageEntity (
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