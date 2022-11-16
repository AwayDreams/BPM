package com.ecmprojectbackend.infrastructure.resources.db.migration.gruopPermission.entity

import javax.persistence.*

@Entity
@Table(name = "[grouppermission]")
data class GroupPermissionEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        val id: Long?,
        @Column
        val name: String,
        @Column
        val permissions: List<PermissionEntity>?
        )