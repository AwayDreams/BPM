package com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission

import com.ecmprojectbackend.domain.groupPermission.GroupPermission
import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity.GroupPermissionEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper


interface GroupPermissionMapper : Mapper<GroupPermission, GroupPermissionEntity>