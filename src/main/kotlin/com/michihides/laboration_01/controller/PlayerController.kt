package com.michihides.laboration_01.controller

import com.michihides.laboration_01.model.Player
import com.michihides.laboration_01.repository.PlayerRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayerController(
    private val playerRepository: PlayerRepository
) {
    @PostMapping("/player")
    fun postNewPlayer(@RequestBody player: Player): Player {

        return playerRepository.save(player)
    }

}