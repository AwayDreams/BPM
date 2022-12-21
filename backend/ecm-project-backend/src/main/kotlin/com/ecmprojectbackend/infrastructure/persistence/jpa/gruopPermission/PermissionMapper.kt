package com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission

import com.ecmprojectbackend.domain.groupPermission.permission.Permission
import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity.PermissionEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper


interface PermissionMapper : Mapper<Permission, PermissionEntity> {
}