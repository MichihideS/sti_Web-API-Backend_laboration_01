package com.michihides.laboration_01.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Player(
    val username: String = "",
    val password: String = "",
    val score: Int = 0,
    val isPro: Boolean = true,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
) {

}