package com.example.debuggingspring.failing

import com.example.debuggingspring.AbstractSpringApplicationTest
import com.example.debuggingspring.TestDebuggingSpringApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

/**
 * This test fails because it triggers the `MongoClientSettingsConfiguration` which sets mongo client settings to its default values.
 */
@SpringBootTest(properties = ["feature.a=true"])
@Import(TestDebuggingSpringApplication::class)
class CustomMongoClientSettingsTest : AbstractSpringApplicationTest()
