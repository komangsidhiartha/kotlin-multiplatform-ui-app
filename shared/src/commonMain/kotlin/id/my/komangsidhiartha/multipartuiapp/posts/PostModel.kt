package id.my.komangsidhiartha.multipartuiapp.posts

import kotlinx.serialization.Serializable

@Serializable
data class PostModel (
    val id: Int,
    val title: String = "",
    val body: String = "",
    val userId: Int = 0
)