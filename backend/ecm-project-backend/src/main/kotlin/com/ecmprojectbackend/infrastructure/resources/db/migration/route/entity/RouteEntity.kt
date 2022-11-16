package com.ecmprojectbackend.infrastructure.resources.db.migration.route.entity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.infrastructure.resources.db.migration.activity.entity.ActivityEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "[route]")
data class RouteEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column
    val name: String,
    @Column
    val key: String,
    @Column
    val content: String,
    @Column
    val activity: ActivityEntity?,
    @Column
    val nextActivity: ActivityEntity?
        )