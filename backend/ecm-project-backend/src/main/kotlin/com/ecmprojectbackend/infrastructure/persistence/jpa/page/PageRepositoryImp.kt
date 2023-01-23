package com.ecmprojectbackend.infrastructure.persistence.jpa.page

import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.domain.page.PageRepository
import org.springframework.stereotype.Repository

@Repository
class PageRepositoryImp(
    private val pageMapper: PageMapper,
    private val pagePersistenceRepository: PagePersistenceRepository
): PageRepository {
    override fun save(page: Page): Page {
        return pageMapper.fromEntity(pagePersistenceRepository.save(pageMapper.fromModel(page)))
    }

    override fun getAll(): List<Page> {
        return pagePersistenceRepository.findAll().map { pageMapper.fromEntity(it) }
    }

    override fun get(pageId: Long): Page {
        return pageMapper.fromEntity(pagePersistenceRepository.findById(pageId).get())
    }

    override fun remove(page: Page) {
        pagePersistenceRepository.delete(pageMapper.fromModel(page))
    }
}