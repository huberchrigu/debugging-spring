package com.example.debuggingspring.failing

import com.example.debuggingspring.AbstractSpringApplicationTest
import org.springframework.boot.test.context.SpringBootTest

/**
 * This test fails due to missing mongo db instance. It can be fixed with `WorkingSpringApplicationTest`.
 */
@SpringBootTest
class MissingMongoContainerTest : AbstractSpringApplicationTest()
