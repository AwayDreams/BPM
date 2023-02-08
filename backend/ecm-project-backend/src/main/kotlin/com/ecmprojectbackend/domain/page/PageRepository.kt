package com.ecmprojectbackend.domain.page


interface PageRepository {
    fun save(page: Page): Page
    fun getAll(): List<Page>
    fun get(pageId: Long): Page
    fun getByDataTypeId(dataTypeId: Long): List<Page>
    fun remove(page: Page)
}