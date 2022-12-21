package com.ecmprojectbackend.infrastructure.persistence.jpa.user

import com.ecmprojectbackend.infrastructure.persistence.jpa.user.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserPersistenceRepository: JpaRepository<UserEntity, Long> {
}