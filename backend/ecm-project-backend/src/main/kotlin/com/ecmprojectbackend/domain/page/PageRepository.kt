package com.ecmprojectbackend.domain.page

import com.ecmprojectbackend.domain.activityType.ActivityType

interface PageRepository {
    fun save(page: Page): Page
    fun getAll(): List<Page>
    fun remove(page: Page)
}