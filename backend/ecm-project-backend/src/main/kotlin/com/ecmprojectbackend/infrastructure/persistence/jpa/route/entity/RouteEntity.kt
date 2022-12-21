package com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.infrastructure.persistence.jpa.activity.entity.ActivityEntity
import javax.persistence.*

@Entity
@Table(name = "[route]")
data class RouteEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column
    val name: String,
    @Column
    val nameKey: String,
    @Column
    val content: String,
    @ManyToOne
    @JoinColumn(name = "activity")
    val activity: ActivityEntity?,
    @ManyToOne
    @JoinColumn(name = "next_activity")
    val nextActivity: ActivityEntity?
        )