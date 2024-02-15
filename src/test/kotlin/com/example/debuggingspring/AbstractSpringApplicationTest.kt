package com.example.debuggingspring

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.test.web.reactive.server.WebTestClient

@AutoConfigureWebTestClient
abstract class AbstractSpringApplicationTest {
    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun postRequestWorks() {
        webTestClient.post().uri("/?uri={uri}", "https://silberruecken.ch")
            .headers { it.setBasicAuth("user", "user") }
            .exchange()
            .expectStatus().isOk
    }
}
