package com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity.GroupPermissionEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.page.entity.PageEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity.SimpleRouteEntity
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
    val routes: List<SimpleRouteEntity>?,
    @Transient
    @ManyToMany(mappedBy = "activities", cascade = [CascadeType.ALL])
    val activityGroupPermissions: List<GroupPermissionEntity>?
        ){
}