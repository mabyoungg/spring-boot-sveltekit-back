package org.example.springbootsveltekitback.domain.post.post.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootsveltekitback.domain.member.member.entity.Member;
import org.example.springbootsveltekitback.domain.post.post.entity.Post;
import org.example.springbootsveltekitback.domain.post.post.repository.PostRepository;
import org.example.springbootsveltekitback.global.rsData.RsData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> findByAuthor(Member author) {
        return postRepository.findByAuthor(author);
    }

    @Transactional
    public RsData<Post> write(Member author, String title, String body) {
        Post post = Post.builder()
                .author(author)
                .title(title)
                .body(body)
                .build();

        postRepository.save(post);

        return RsData.of("200-1", "글 작성 성공", post);
    }
}
