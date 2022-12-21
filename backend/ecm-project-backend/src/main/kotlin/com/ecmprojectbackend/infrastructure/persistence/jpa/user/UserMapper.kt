package com.ecmprojectbackend.infrastructure.persistence.jpa.user

import com.ecmprojectbackend.domain.user.User
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.user.entity.UserEntity


interface UserMapper : Mapper<User, UserEntity> {
}