package com.example.debuggingspring.ping

import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class PingService(private val pingRepository: PingRepository, private val webClient: WebClient) {
    fun getAll() = pingRepository.findAll()
    fun testUri(uri: String) = webClient.get().uri(uri).retrieve()
        .toBodilessEntity()
        .flatMap { updateStatus(uri, it.statusCode) }

    private fun updateStatus(uri: String, statusCode: HttpStatusCode) = pingRepository.findByUri(uri)
        .map { it.copy(lastStatus = statusCode.value()) }
        .defaultIfEmpty(Ping(null, uri, statusCode.value()))
        .flatMap { pingRepository.save(it) }
}

