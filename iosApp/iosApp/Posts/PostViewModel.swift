import Foundation
import Shared

@MainActor
class PostViewModel: ObservableObject {
    @Published var posts: [PostModel] = []
    @Published var isLoading = false
    @Published var errorMessage: String? = nil

    private let repository: PostRepository

    init(repository: PostRepository = PostRepository(apiClient: ApiClient().client)) {
        self.repository = repository
    }

    func fetchPosts() {
        isLoading = true
        errorMessage = nil

        Task {
            do {
                let result = try await self.repository.loadPosts()
                self.posts = result
            } catch {
                self.errorMessage = error.localizedDescription
            }
            self.isLoading = false
        }
    }
}
