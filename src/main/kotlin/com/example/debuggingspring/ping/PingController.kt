package com.example.debuggingspring.ping

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController(private val pingService: PingService) {
    @GetMapping("/")
    fun getAll() = pingService.getAll()

    @PostMapping("/")
    fun testUri(uri: String) = pingService.testUri(uri)
}
