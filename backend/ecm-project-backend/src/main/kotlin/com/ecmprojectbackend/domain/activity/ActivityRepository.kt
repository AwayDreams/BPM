package com.ecmprojectbackend.domain.activity

interface ActivityRepository {
    fun save(activity: Activity): Activity
}