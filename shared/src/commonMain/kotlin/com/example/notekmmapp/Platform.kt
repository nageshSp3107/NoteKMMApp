package com.example.notekmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform