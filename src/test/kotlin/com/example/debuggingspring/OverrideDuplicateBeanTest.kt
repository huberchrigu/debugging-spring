package com.example.debuggingspring

import com.example.debuggingspring.testconfig.DummyPingServiceConfig
import com.example.debuggingspring.testconfig.DummyPingServiceConfig2
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

/**
 * This fixes the `DuplicateBeanTest` by allowing [DummyPingServiceConfig2] to override the bean configured in [DummyPingServiceConfig].
 * Here we activate another DEBUG logger to get messages like:
 * ```
 * 2024-08-01T12:25:43.881+02:00 DEBUG 3788 --- [    Test worker] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'pingService' with a different definition: replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=com.example.debuggingspring.testconfig.DummyPingServiceConfig; factoryMethodName=mockPingService; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [com/example/debuggingspring/testconfig/DummyPingServiceConfig.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=com.example.debuggingspring.testconfig.DummyPingServiceConfig2; factoryMethodName=primaryPingService; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [com/example/debuggingspring/testconfig/DummyPingServiceConfig2.class]]
 * ```
 */
@SpringBootTest(properties = ["spring.main.allow-bean-definition-overriding=true", "logging.level.org.springframework.beans.factory=DEBUG"])
@Import(DummyPingServiceConfig::class, DummyPingServiceConfig2::class)
class OverrideDuplicateBeanTest : AbstractSpringApplicationTest()
