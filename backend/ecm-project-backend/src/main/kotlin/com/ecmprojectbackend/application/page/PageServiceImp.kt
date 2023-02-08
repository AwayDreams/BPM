package com.ecmprojectbackend.application.page

import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.domain.page.PageRepository
import com.ecmprojectbackend.domain.page.PageService
import com.ecmprojectbackend.infrastructure.persistence.jpa.page.PageMapper
import org.springframework.stereotype.Service

@Service
class PageServiceImp(
    private val pageRepository: PageRepository,
): PageService {
    override fun save(page: Page): Page {
        return pageRepository.save(page)
    }

    override fun getAll(): List<Page> {
        return pageRepository.getAll()
    }

    override fun get(pageId: Long): Page {
        return pageRepository.get(pageId)
    }

    override fun getByDataTypeId(dataTypeId: Long): List<Page> {
        return pageRepository.getByDataTypeId(dataTypeId)
    }

    override fun remove(page: Page) {
        pageRepository.remove(page)
    }

}