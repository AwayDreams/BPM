package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity.GroupPermissionEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.page.entity.PageEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity.ProcessTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.RouteEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.SimpleRouteEntity
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonManagedReference
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[activitytype]")
@NoArgsConstructor
data class ActivityTypeEntity (
    @Id
    @Column
    val id: String?,
    @Column
    val name: String,
    @Column
    val type: String,
    @ManyToOne
    @JoinColumn(name = "page")
    val page: PageEntity?,
    @Column(name = "processType")
    val processTypeId: Long?,
    @OneToMany
    @JoinColumn(name = "activity")
    @Transient
    val routes: List<SimpleRouteEntity>?,
    @Transient
    @ManyToMany(mappedBy = "activities", cascade = [CascadeType.ALL])
    val activityGroupPermissions: List<GroupPermissionEntity>?
        ){
    constructor() : this(null, "", "", null, null, null, null)
}