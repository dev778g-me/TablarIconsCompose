package com.dev.tablaricons_compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform