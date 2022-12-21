package com.ecmprojectbackend.infrastructure.persistence.jpa.activity.entity

import com.ecmprojectbackend.domain.user.User
import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.user.entity.UserEntity
import javax.persistence.*

@Entity
@Table(name = "[activity]")
data class ActivityEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "user")
    val user: UserEntity?,
    @ManyToOne
    @JoinColumn(name = "activitytype")
    val activityType: ActivityTypeEntity?
        )