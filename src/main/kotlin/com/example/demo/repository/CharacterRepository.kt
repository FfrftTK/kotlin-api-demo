package com.example.demo.repository

import com.example.demo.entity.Character
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CharacterRepository : JpaRepository<Character, Long> {

}