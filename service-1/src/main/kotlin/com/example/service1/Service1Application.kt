package com.example.service1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
class Service1Application

fun main(args: Array<String>) {
    runApplication<Service1Application>(*args)
}
