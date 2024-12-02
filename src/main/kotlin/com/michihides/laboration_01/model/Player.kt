package com.michihides.laboration_01.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Player(
    var username: String = "",
    var password: String = "",
    var score: Int = 0,
    var isPro: Boolean = true,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
) {

}