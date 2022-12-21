package com.ecmprojectbackend.infrastructure.persistence.jpa.page

import com.ecmprojectbackend.domain.page.Page
import com.ecmprojectbackend.infrastructure.persistence.jpa.mapper.Mapper
import com.ecmprojectbackend.infrastructure.persistence.jpa.page.entity.PageEntity


interface PageMapper : Mapper<Page, PageEntity>