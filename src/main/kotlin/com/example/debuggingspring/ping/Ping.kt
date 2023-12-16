package com.example.debuggingspring.ping

import org.bson.types.ObjectId

data class Ping(val id: ObjectId?, val uri: String, val lastStatus: Int)
