package com.ecmprojectbackend.infrastructure.resources.db.migration.activity.entity

import com.ecmprojectbackend.domain.user.User
import javax.persistence.*

@Entity
@Table(name = "[activity]")
data class ActivityEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @Column
    val user: User
        )