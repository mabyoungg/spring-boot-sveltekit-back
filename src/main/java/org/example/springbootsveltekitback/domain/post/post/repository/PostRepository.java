package org.example.springbootsveltekitback.domain.post.post.repository;

import org.example.springbootsveltekitback.domain.member.member.entity.Member;
import org.example.springbootsveltekitback.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByAuthor(Member author);
}
