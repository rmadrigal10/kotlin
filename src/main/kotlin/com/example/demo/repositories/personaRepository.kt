package com.example.demo.repositories

import com.example.demo.model.persona
import org.springframework.data.repository.CrudRepository

interface personaRepository : CrudRepository<persona, Long> {
}