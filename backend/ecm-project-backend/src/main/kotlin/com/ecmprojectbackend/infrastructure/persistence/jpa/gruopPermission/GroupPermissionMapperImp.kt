package com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission

import com.ecmprojectbackend.domain.groupPermission.GroupPermission
import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity.GroupPermissionEntity
import org.springframework.stereotype.Service

@Service
class GroupPermissionMapperImp(
    private val permissionMapper: PermissionMapper
) : GroupPermissionMapper {
    override fun fromModel(model: GroupPermission): GroupPermissionEntity {
        return GroupPermissionEntity(
            model.id,
            model.name,
            model.permissions?.let { it.map { permissionMapper.fromModel(it) } },
            null,
            null
        )
    }

    override fun fromEntity(entity: GroupPermissionEntity): GroupPermission {
        return GroupPermission(
            entity.id,
            entity.name,
            entity.permissions?.let { it.map { permissionMapper.fromEntity(it) } }
        )
    }
}