package com.ecmprojectbackend.domain.page


interface PageRepository {
    fun save(page: Page): Page
    fun getAll(): List<Page>
    fun get(pageId: Long): Page
    fun remove(page: Page)
}