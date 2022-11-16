package com.ecmprojectbackend.infrastructure.resources.db.migration.activity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.infrastructure.resources.db.migration.activity.entity.ActivityEntity
import com.ecmprojectbackend.infrastructure.resources.db.migration.mapper.Mapper

interface ActivityMapper : Mapper<Activity, ActivityEntity>