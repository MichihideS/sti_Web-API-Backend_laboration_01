package com.michihides.laboration_01.controller

import com.michihides.laboration_01.model.Player
import com.michihides.laboration_01.repository.PlayerRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/player")
class PlayerController(
    private val playerRepository: PlayerRepository
) {
    // GET
    @GetMapping
    fun getPlayerByPlayerId(@RequestParam("id") id: Long): ResponseEntity<Player> {
        val foundPlayerOptional = playerRepository.findById(id)

        if (foundPlayerOptional.isPresent) {
            val foundPlayerNotOptional = foundPlayerOptional.get()

            return ResponseEntity.status(200).body(foundPlayerNotOptional)
        }

        return ResponseEntity.notFound().build()
    }

    // POST
    @PostMapping
    fun postNewPlayer(@RequestBody player: Player): ResponseEntity<String> {

        playerRepository.save(player)

        return ResponseEntity.status(201).body("Player Created")
    }

}