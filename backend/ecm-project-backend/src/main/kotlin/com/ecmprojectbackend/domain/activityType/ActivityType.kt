package com.ecmprojectbackend.domain.activityType

import com.ecmprojectbackend.domain.groupPermission.GroupPermission
import com.ecmprojectbackend.domain.page.Page

data class ActivityType (
    val id: Long?,
    val name: String,
    val type: String,
    val page: Page?,
    val process: Process?,
    val activityGroupPermissions: List<GroupPermission>?
        )