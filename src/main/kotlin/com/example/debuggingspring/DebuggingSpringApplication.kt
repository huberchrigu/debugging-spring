package com.example.debuggingspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DebuggingSpringApplication

fun main(args: Array<String>) {
    runApplication<DebuggingSpringApplication>(*args)
}
