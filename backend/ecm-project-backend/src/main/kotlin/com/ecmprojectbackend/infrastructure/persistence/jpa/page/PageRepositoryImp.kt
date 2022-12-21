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
}