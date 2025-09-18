package id.my.komangsidhiartha.multipartuiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import id.my.komangsidhiartha.multipartuiapp.posts.PostListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            PostListScreen()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    PostListScreen()
}