package com.example.demo.controller

import com.example.demo.entity.Character
import com.example.demo.service.CharacterService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1/characters")
class CharacterController (private val characterService: CharacterService) {

    @GetMapping("")
    fun findAll(): List<Character> {
        return characterService.findAll()
    }

    @PostMapping("")
    fun create(@RequestBody character: Character): Character {
        characterService.save(character)
        return character
    }

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): Optional<Character> {
        return characterService.findById(id)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long): Unit = characterService.delete(id)

}