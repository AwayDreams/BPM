package com.ecmprojectbackend.infrastructure.resources.db.migration.user.entity

import com.ecmprojectbackend.infrastructure.resources.db.migration.gruopPermission.entity.GroupPermissionEntity
import javax.persistence.*

@Entity
@Table(name = "[user]")
data class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column
    val user: String?,
    @Column
    val password: String?,
    @Column
    val Name: String,
    @Column
    val groupPermissions: List<GroupPermissionEntity>?
        )