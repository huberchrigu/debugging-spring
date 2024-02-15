package com.example.debuggingspring

import com.example.debuggingspring.testconfig.DummyPingServiceConfig
import com.example.debuggingspring.testconfig.DummyPingServiceConfig2
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@SpringBootTest(properties = ["spring.main.allow-bean-definition-overriding=true"])
@Import(DummyPingServiceConfig::class, DummyPingServiceConfig2::class)
class OverrideDuplicateBeanTest : AbstractSpringApplicationTest()
