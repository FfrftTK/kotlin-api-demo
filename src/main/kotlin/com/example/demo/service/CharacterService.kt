package com.example.demo.service

import com.example.demo.entity.Character
import com.example.demo.repository.CharacterRepository
import org.springframework.stereotype.Service

@Service
class CharacterService (private val characterRepository: CharacterRepository) {

    fun findAll(): List<Character> = characterRepository.findAll()

    fun findById(id: Long) = characterRepository.findById(id)

    fun save(character: Character) = characterRepository.save(character)

    fun delete(id: Long) = characterRepository.deleteById(id)

}