package id.my.komangsidhiartha.multipartuiapp.posts

import common.networking.ApiClient
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.http.HttpHeaders

class PostRepository(
    private val apiClient: HttpClient = ApiClient.client
) {
    suspend fun loadPosts(): List<PostModel> {
        return apiClient.get("https://jsonplaceholder.typicode.com/posts") {
            headers {
                append(HttpHeaders.ContentType, "application/json")
            }
        }.body<List<PostModel>>()
    }

    suspend fun loadPost(postId: Int): PostModel {
        return apiClient.get("https://jsonplaceholder.typicode.com/posts/$postId") {
            headers {
                append(HttpHeaders.ContentType, "application/json")
            }
        }.body<PostModel>()
    }
}