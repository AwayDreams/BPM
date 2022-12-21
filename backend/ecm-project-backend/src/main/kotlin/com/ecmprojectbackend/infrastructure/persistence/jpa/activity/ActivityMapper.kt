package com.ecmprojectbackend.infrastructure.persistence.jpa.activity

import com.ecmprojectbackend.domain.activity.Activity
import com.ecmprojectbackend.infrastructure.persistence.jpa.activity.entity.ActivityEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper

interface ActivityMapper : Mapper<Activity, ActivityEntity>