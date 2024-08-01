package com.example.debuggingspring.autoconfig

import com.mongodb.MongoClientSettings
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MongoClientSettingsConfiguration {

    @ConditionalOnProperty("feature.a", havingValue = "true")
    @Bean
    fun customMongoClientSettings() = MongoClientSettings.builder().build()
}
