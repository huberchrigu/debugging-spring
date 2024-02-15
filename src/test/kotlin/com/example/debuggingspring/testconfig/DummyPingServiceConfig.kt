package com.example.debuggingspring.testconfig

import com.example.debuggingspring.ping.PingService
import org.mockito.kotlin.any
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.mock
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import reactor.core.publisher.Mono

@TestConfiguration
class DummyPingServiceConfig {
    @Bean("pingService")
    fun mockPingService() = mock<PingService> {
        on { testUri(any()) } doAnswer {
            println("Used mock ping service")
            Mono.empty()
        }
    }
}
