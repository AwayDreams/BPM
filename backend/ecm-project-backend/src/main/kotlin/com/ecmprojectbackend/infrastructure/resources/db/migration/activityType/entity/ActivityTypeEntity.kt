package com.ecmprojectbackend.infrastructure.resources.db.migration.activityType.entity

import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.infrastructure.resources.db.migration.gruopPermission.entity.GroupPermissionEntity
import javax.persistence.*

@Entity
@Table(name = "[activitytype]")
data class ActivityTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @Column
    val name: String,
    @Column
    val type: String,
    @Column
    val page: Page?,
    @Column
    val process: Process?,
    @Column
    val activityGroupPermissions: List<GroupPermissionEntity>?
        )