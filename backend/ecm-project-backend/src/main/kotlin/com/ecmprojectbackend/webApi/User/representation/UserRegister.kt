package com.ecmprojectbackend.webApi.User.representation

import com.ecmprojectbackend.domain.user.User

data class UserRegister (
    val user: String?,
    val password: String?,
    val name: String,
        ){
    fun toModel(): User {
        return User(
            null,
            user,
            password,
            name,
            null
        )
    }
}