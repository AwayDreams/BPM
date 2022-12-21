package com.ecmprojectbackend.domain.user

interface UserRepository {
    fun save(user: User): User
}