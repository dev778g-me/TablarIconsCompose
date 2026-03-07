package com.dev.tablaricons_compose

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "TablarIconsCompose",
    ) {
        App()
    }
}