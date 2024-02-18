package com.ecmprojectbackend.domain.user

import com.ecmprojectbackend.domain.groupPermission.GroupPermission
import lombok.NoArgsConstructor

@NoArgsConstructor
data class User (
    val id: Long?,
    val user: String?,
    val password: String?,
    val name: String,
    val groupPermissions: List<GroupPermission>?
)
