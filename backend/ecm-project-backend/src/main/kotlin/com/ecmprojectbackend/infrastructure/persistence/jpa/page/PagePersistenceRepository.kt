package com.ecmprojectbackend.infrastructure.persistence.jpa.page

import com.ecmprojectbackend.infrastructure.persistence.jpa.page.entity.PageEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.user.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PagePersistenceRepository: JpaRepository<PageEntity, Long> {
    fun findByDataTypeId(dataTypeId: Long): List<PageEntity>
}