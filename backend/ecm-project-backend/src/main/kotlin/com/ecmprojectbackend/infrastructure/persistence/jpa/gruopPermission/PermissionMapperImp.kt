package com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission

import com.ecmprojectbackend.domain.groupPermission.permission.Permission
import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity.PermissionEntity
import org.springframework.stereotype.Repository

@Repository
class PermissionMapperImp : PermissionMapper {
    override fun fromModel(model: Permission): PermissionEntity {
        return PermissionEntity(
            model.id,
            model.name
        )
    }

    override fun fromEntity(entity: PermissionEntity): Permission {
        return Permission(
            entity.id,
            entity.name
        )
    }
}