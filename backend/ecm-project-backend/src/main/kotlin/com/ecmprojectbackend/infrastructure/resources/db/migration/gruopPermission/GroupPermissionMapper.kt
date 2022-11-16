package com.ecmprojectbackend.infrastructure.resources.db.migration.gruopPermission

import com.ecmprojectbackend.domain.groupPermission.GroupPermission
import com.ecmprojectbackend.infrastructure.resources.db.migration.gruopPermission.entity.GroupPermissionEntity
import com.ecmprojectbackend.infrastructure.resources.db.migration.mapper.Mapper

interface GroupPermissionMapper : Mapper<GroupPermission, GroupPermissionEntity>