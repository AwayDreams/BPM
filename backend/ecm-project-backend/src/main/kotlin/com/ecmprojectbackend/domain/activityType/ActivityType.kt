package com.ecmprojectbackend.domain.activityType

import com.ecmprojectbackend.domain.groupPermission.GroupPermission
import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.domain.processType.ProcessType

data class ActivityType (
    val id: String?,
    val name: String,
    val type: String,
    val page: Page?,
    val processType: ProcessType?,
    val activityGroupPermissions: List<GroupPermission>?
        )