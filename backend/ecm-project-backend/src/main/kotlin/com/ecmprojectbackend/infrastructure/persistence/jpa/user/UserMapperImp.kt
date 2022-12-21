package com.ecmprojectbackend.infrastructure.persistence.jpa.user

import com.ecmprojectbackend.domain.user.User
import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.GroupPermissionMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.user.entity.UserEntity
import org.springframework.stereotype.Service

@Service
class UserMapperImp(
    private val groupPermissionMapper: GroupPermissionMapper
) : UserMapper {
    override fun fromModel(model: User): UserEntity {
        return UserEntity(
            model.id,
            model.user,
            model.password,
            model.name,
            model.groupPermissions?.let { it.map { groupPermissionMapper.fromModel(it) } }
        )
    }

    override fun fromEntity(entity: UserEntity): User {
        return User(
            entity.id,
            entity.user,
            entity.password,
            entity.name,
            entity.groupPermissions?.let { it.map { groupPermissionMapper.fromEntity(it) } }
        )
    }
}