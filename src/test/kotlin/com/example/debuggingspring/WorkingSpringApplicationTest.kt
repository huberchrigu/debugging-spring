package com.example.debuggingspring

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@SpringBootTest
@Import(TestDebuggingSpringApplication::class)
class WorkingSpringApplicationTest : AbstractSpringApplicationTest()
