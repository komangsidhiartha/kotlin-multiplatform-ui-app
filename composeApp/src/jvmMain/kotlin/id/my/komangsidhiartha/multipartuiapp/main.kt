package id.my.komangsidhiartha.multipartuiapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import id.my.komangsidhiartha.multipartuiapp.posts.PostListScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MultipartUIApp",
    ) {
        PostListScreen()
    }
}