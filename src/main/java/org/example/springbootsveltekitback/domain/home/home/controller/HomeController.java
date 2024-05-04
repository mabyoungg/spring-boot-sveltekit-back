package org.example.springbootsveltekitback.domain.home.home.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.springbootsveltekitback.global.exceptions.GlobalException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.TEXT_HTML_VALUE;

@Controller
@Tag(name = "HomeController", description = "홈 컨트롤러")
@RequestMapping(value = "", produces = TEXT_HTML_VALUE)
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    @Operation(summary = "메인 페이지")
    public String showMain() {
        if (true) {
            throw new GlobalException("404-1", "존재하지 않는 페이지입니다.");
        }

        return "홈";
    }
}
