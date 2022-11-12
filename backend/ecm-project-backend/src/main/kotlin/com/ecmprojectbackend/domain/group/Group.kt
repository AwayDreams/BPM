package com.ecmprojectbackend.domain.group

import com.ecmprojectbackend.domain.group.permission.Permission

data class Group (
    val id: Long?,
    val Name: String,
    val permissions: List<Permission>?
    )