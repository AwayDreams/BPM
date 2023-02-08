package com.ecmprojectbackend.domain.page

import com.ecmprojectbackend.domain.dataType.DataType

interface PageService {
    fun save(page: Page): Page
    fun getAll(): List<Page>
    fun get(pageId: Long): Page
    fun getByDataTypeId(dataTypeId: Long): List<Page>
    fun remove(page: Page)
}