package com.example.service1

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "service-2")
interface Service2Client {

    @GetMapping("/api/add/{num1}/{num2}")
    fun add(@PathVariable num1: Int, @PathVariable num2: Int): Int

    @GetMapping("/api/hi")
    fun hi(): String
}
