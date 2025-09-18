import SwiftUI

struct PostListView: View {
    @StateObject private var viewModel = PostViewModel()

    var body: some View {
        NavigationView {
            Group {
                if viewModel.isLoading {
                    ProgressView("Loading posts...")
                } else if let error = viewModel.errorMessage {
                    Text("error \(error)")
                        .foregroundColor(.red)
                } else {
                    List(viewModel.posts, id: \.id) { post in
                        VStack(alignment: .leading, spacing: 8) {
                            Text(post.title)
                            .font(.headline)
                            Text(post.body)
                            .font(.subheadline)
                            .foregroundColor(.secondary)
                        }
                        .padding(.vertical, 4)
                    }
                }
            }
            .navigationTitle("Posts")
        }
        .onAppear {
            viewModel.fetchPosts()
        }
    }
}
