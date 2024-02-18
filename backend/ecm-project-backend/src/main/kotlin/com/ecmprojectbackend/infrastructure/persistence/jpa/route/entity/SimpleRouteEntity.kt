package com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity


import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[route]")
@NoArgsConstructor
data class SimpleRouteEntity (
    @Id
    val id: String?,
    @Column
    val name: String,
    @Column
    val nameKey: String,
    @Column
    val content: String,
    @Column(name = "activity")
    val activityId: String?,
    @Column(name = "next_activity")
    val nextActivityId: String?
        ){
}