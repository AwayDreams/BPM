package com.ecmprojectbackend.domain.user

import com.ecmprojectbackend.domain.groupPermission.GroupPermission

data class User (
    val id: Long?,
    val user: String?,
    val password: String?,
    val Name: String,
    val groupPermissions: List<GroupPermission>?
)
