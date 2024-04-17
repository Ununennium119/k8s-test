package com.example.service1

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Controller(
    private val service2Client: Service2Client,
) {

    @GetMapping("/add/{num1}/{num2}")
    fun add(
        @PathVariable num1: Int,
        @PathVariable num2: Int,
    ): ResponseEntity<Int> {
        return ResponseEntity.ok(service2Client.add(num1, num2))
    }

    @GetMapping("/mult/{num1}/{num2}")
    fun mult(
        @PathVariable num1: Int,
        @PathVariable num2: Int,
    ): ResponseEntity<Int> {
        return ResponseEntity.ok(num1 * num2)
    }

    @GetMapping("/hello")
    fun hello(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World!")
    }

    @GetMapping("/hi")
    fun hi(): ResponseEntity<String> {
        return ResponseEntity.ok(service2Client.hi())
    }

    @GetMapping("/is-leader")
    fun isLeader(): ResponseEntity<Boolean> {
        return ResponseEntity.ok(true)
    }
}
