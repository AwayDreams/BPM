package com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity


import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*
import kotlin.jvm.Transient

@Entity
@Table(name = "[route]")
data class SimpleRouteEntity (
    @Id
    val id: String?,
    @Column
    val name: String,
    @Column
    val nameKey: String,
    @Column
    val content: String,
    @Column(name = "activity")
    val activityId: String?,
    @ManyToOne
    @JoinColumn(name = "next_activity")
    val nextActivity: ActivityTypeEntity?
        ){
    constructor() : this(null, "", "", "", null, null)
}