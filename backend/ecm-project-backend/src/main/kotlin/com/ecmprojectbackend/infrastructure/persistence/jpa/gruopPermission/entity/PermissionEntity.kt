package com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity

import javax.persistence.*

@Entity
@Table(name = "[permission]")
data class PermissionEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        @Column
        val name: String
        )