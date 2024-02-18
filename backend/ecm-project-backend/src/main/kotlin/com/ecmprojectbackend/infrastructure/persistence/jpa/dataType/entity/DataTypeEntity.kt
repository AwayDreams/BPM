package com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity

import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[datatype]")
@NoArgsConstructor
data class DataTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @Column
    val name: String?
        ){
}