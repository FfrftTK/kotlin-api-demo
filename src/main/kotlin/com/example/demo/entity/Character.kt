package com.example.demo.entity

import javax.persistence.*

@Entity
@Table(name = "characters")
data class Character(
    @Id
    @SequenceGenerator(name = "characters_id_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = -1,

    @Column(name = "username", length = 100, nullable = false)
    val username: String = "",

    @Column(name = "age", nullable = false)
    val age: Long = 0,

    @Column(name = "jobs", length = 100)
    val jobs: String? = null
)