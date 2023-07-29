package com.example.notekmmapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, Nagesh and Sejal in ${platform.name}!"
    }
}