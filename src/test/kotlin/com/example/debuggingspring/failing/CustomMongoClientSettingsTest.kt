package com.example.debuggingspring.failing

import com.example.debuggingspring.AbstractSpringApplicationTest
import com.example.debuggingspring.TestDebuggingSpringApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@SpringBootTest(properties = ["feature.a=true"])
@Import(TestDebuggingSpringApplication::class)
class CustomMongoClientSettingsTest : AbstractSpringApplicationTest()
