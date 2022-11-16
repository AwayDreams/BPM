package com.ecmprojectbackend.infrastructure.resources.db.migration.gruopPermission

import com.ecmprojectbackend.domain.groupPermission.GroupPermission
import com.ecmprojectbackend.infrastructure.resources.db.migration.gruopPermission.entity.GroupPermissionEntity

class GroupPermissionMapperImp : GroupPermissionMapper {
    override fun fromModel(model: GroupPermission): GroupPermissionEntity {
        return GroupPermissionEntity(
            model.id,
            model.name,
            model.permissions
        )
    }

    override fun fromEntity(entity: GroupPermissionEntity): GroupPermission {
        return GroupPermission(
            entity.id,
            entity.name,
            entity.permissions
        )
    }
}