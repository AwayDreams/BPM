package com.ecmprojectbackend.infrastructure.persistence.jpa.user

import com.ecmprojectbackend.domain.user.User
import com.ecmprojectbackend.domain.user.UserRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImp(
    private val userPersistenceRepository: UserPersistenceRepository,
    private val userMapper: UserMapper
): UserRepository {

    override fun save(user: User): User {
        return userMapper.fromEntity(userPersistenceRepository.save(userMapper.fromModel(user)))
    }
}