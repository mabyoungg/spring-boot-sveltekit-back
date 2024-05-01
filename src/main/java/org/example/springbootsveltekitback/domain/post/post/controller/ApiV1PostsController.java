package org.example.springbootsveltekitback.domain.post.post.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.springbootsveltekitback.domain.member.member.entity.Member;
import org.example.springbootsveltekitback.domain.post.post.dto.PostDto;
import org.example.springbootsveltekitback.domain.post.post.entity.Post;
import org.example.springbootsveltekitback.domain.post.post.service.PostService;
import org.example.springbootsveltekitback.global.rq.Rq;
import org.example.springbootsveltekitback.global.rsData.RsData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/posts")
@RequiredArgsConstructor
@Tag(name = "ApiV1PostsController", description = "post 컨트롤러")
public class ApiV1PostsController {
    private final Rq rq;
    private final PostService postService;

    @Getter
    public static class GetMineResponseBody {
        private final List<PostDto> items;

        public GetMineResponseBody(List<Post> posts) {
            this.items = posts
                    .stream()
                    .map(PostDto::new)
                    .toList();
        }
    }

    @GetMapping("/mine")
    @Operation(summary = "내 글 리스트")
    public RsData<GetMineResponseBody> getMine() {
        Member member = rq.getMember();

        List<Post> posts = postService.findByAuthor(member);

        return RsData.of(
                "200",
                "내 글 가져오기 성공",
                new GetMineResponseBody(posts)
        );
    }
}
