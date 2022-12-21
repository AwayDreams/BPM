package com.ecmprojectbackend.domain.user

import org.springframework.stereotype.Service

@Service
interface UserService {
    fun save(user: User): User
}