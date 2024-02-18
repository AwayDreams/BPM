package com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.entity.FieldTypeEntity
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[field]")
@NoArgsConstructor
data class SimpleFieldEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "[fieldtype]")
    val fieldType: FieldTypeEntity?,
    @Column(name = "process")
    val processId: Long?,
    @Column
    val value: String,
){
}