package com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity


import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[route]")
data class RouteEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: String?,
    @Column
    val name: String,
    @Column
    val nameKey: String,
    @Column
    val content: String,
    @ManyToOne
    @JoinColumn(name = "activity")
    val activity: ActivityTypeEntity?,
    @ManyToOne
    @JoinColumn(name = "next_activity")
    val nextActivity: ActivityTypeEntity?
        )