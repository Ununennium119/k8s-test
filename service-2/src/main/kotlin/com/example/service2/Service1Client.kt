package com.example.service2

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


@FeignClient(name = "service-1")
interface Service1Client {

    @GetMapping("/api/add/{num1}/{num2}")
    fun mult(@PathVariable num1: Int, @PathVariable num2: Int): Int

    @GetMapping("/api/hello")
    fun hello(): String
}
