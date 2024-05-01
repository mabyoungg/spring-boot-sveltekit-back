package org.example.springbootsveltekitback.domain.article.article.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.springbootsveltekitback.domain.article.article.entity.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/articles", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Tag(name = "ApiV1ArticlesController", description = "article 컨트롤러")
public class ApiV1ArticlesController {
    @GetMapping("")
    @Operation(summary = "게시물 리스트")
    public List<Article> getArticles() {
        return new ArrayList<>() {{
            add(new Article(1L));
            add(new Article(2L));
            add(new Article(3L));
        }};
    }
}
