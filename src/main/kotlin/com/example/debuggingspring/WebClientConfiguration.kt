package com.example.debuggingspring

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration {
    @Bean
    fun webClient(webClientBuilder: WebClient.Builder) = webClientBuilder.build()
}
