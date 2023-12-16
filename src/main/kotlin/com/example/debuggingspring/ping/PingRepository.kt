package com.example.debuggingspring.ping

import com.example.debuggingspring.ping.Ping
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Mono

interface PingRepository : ReactiveMongoRepository<Ping, ObjectId> {
    fun findByUri(uri: String): Mono<Ping>
}
