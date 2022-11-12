package com.ecmprojectbackend.domain.user

import com.ecmprojectbackend.domain.group.Group

data class User (
    val id: Long?,
    val user: String?,
    val password: String?,
    val Name: String,
    val groups: List<Group>?
)
