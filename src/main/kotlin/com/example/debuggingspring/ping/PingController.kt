package com.example.debuggingspring.ping

import org.springframework.http.HttpStatusCode
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient

@RestController
class PingController(private val pingRepository: PingRepository, private val webClient: WebClient) {
    @GetMapping("/")
    fun getAll() = pingRepository.findAll()

    @PostMapping("/")
    fun testUri(uri: String) = webClient.get().uri(uri).retrieve()
        .toBodilessEntity()
        .flatMap { updateStatus(uri, it.statusCode) }

    private fun updateStatus(uri: String, statusCode: HttpStatusCode) = pingRepository.findByUri(uri)
        .map { it.copy(lastStatus = statusCode.value()) }
        .defaultIfEmpty(Ping(null, uri, statusCode.value()))
        .flatMap { pingRepository.save(it) }
}
