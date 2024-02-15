package com.example.debuggingspring.failing

import com.example.debuggingspring.AbstractSpringApplicationTest
import com.example.debuggingspring.testconfig.DummyPingServiceConfig
import com.example.debuggingspring.testconfig.DummyPingServiceConfig2
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@SpringBootTest
@Import(DummyPingServiceConfig::class, DummyPingServiceConfig2::class)
class DuplicateBeanTest : AbstractSpringApplicationTest()
