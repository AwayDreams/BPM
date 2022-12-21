package com.ecmprojectbackend.domain.page

interface PageRepository {
    fun save(page: Page): Page
}