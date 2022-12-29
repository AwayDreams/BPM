package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity.GroupPermissionEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.page.entity.PageEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity.ProcessEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import javax.persistence.*

@Entity
@Table(name = "[activitytype]")
data class ActivityTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: String?,
    @Column
    val name: String,
    @Column
    val type: String,
    @ManyToOne
    @JoinColumn(name = "page")
    val page: PageEntity?,
    @ManyToOne
    @JoinColumn(name = "processtype")
    val processType: ProcessTypeEntity?,
    @ManyToMany(mappedBy = "activities", cascade = [CascadeType.ALL])
    val activityGroupPermissions: List<GroupPermissionEntity>?
        )