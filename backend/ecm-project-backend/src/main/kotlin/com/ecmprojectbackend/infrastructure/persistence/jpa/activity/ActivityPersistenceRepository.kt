package com.ecmprojectbackend.infrastructure.persistence.jpa.activity

import com.ecmprojectbackend.infrastructure.persistence.jpa.activity.entity.ActivityEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityPersistenceRepository: JpaRepository<ActivityEntity, Long> {
}