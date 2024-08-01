package com.example.debuggingspring

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

/**
 * Fixes the `MissingMongoContainerTest` by importing [TestDebuggingSpringApplication] with its mongo container configuration.
 */
@SpringBootTest
@Import(TestDebuggingSpringApplication::class)
class WorkingSpringApplicationTest : AbstractSpringApplicationTest()
