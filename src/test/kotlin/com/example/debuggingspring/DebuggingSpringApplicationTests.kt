package com.example.debuggingspring

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@SpringBootTest
@Import(TestDebuggingSpringApplication::class)
class DebuggingSpringApplicationTests {

    @Test
    fun contextLoads() {
    }

}
