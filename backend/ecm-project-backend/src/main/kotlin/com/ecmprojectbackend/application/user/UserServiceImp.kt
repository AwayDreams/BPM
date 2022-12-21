package com.ecmprojectbackend.application.user

import com.ecmprojectbackend.domain.user.User
import com.ecmprojectbackend.domain.user.UserRepository
import com.ecmprojectbackend.domain.user.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImp(
    private val userRepository: UserRepository
) : UserService {

    override fun save(user: User): User {
        return userRepository.save(user)
    }
}