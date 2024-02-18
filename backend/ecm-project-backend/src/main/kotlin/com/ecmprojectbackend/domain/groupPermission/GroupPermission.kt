package com.ecmprojectbackend.domain.groupPermission

import com.ecmprojectbackend.domain.groupPermission.permission.Permission
import lombok.NoArgsConstructor

@NoArgsConstructor
data class GroupPermission (
    val id: Long?,
    val name: String,
    val permissions: List<Permission>?
    )