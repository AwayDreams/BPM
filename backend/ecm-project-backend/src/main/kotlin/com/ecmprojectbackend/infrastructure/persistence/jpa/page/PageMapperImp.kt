package com.ecmprojectbackend.infrastructure.persistence.jpa.page

import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.DataTypeMapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.page.entity.PageEntity
import org.springframework.stereotype.Service

@Service
class PageMapperImp(
    private val dataTypeMapper: DataTypeMapper
) : PageMapper {
    override fun fromModel(model: Page): PageEntity {
        return PageEntity(
            model.id,
            model.dataType?.let { dataTypeMapper.fromModel(it) },
            model.name,
            model.content
        )
    }

    override fun fromEntity(entity: PageEntity): Page {
        return Page(
            entity.id,
            entity.dataType?.let { dataTypeMapper.fromEntity(it) },
            entity.name,
            entity.content
        )
    }
}