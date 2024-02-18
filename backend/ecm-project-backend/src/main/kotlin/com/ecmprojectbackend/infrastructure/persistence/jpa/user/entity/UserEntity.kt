package com.ecmprojectbackend.infrastructure.persistence.jpa.user.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity.GroupPermissionEntity
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[user]")
@NoArgsConstructor
data class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column
    val user: String?,
    @Column
    val password: String?,
    @Column
    val name: String,
    @ManyToMany(mappedBy = "users", cascade = [CascadeType.ALL])
    val groupPermissions: List<GroupPermissionEntity>?
        )