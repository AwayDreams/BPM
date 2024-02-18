package com.ecmprojectbackend.infrastructure.persistence.jpa.page.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[page]")
@NoArgsConstructor
data class PageEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "datatype")
    val dataType: DataTypeEntity?,
    @Column
    val name: String,
    @Column
    val content: String
        ){
}