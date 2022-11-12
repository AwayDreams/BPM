package com.ecmprojectbackend.domain.activity

import com.ecmprojectbackend.domain.user.User

data class Activity (
    val id: Long?,
    val user: User
        )