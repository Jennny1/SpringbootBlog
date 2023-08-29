package com.example.springbootblog.service;


import com.example.springbootblog.domain.Article;
import com.example.springbootblog.dto.AddArticleRequest;
import com.example.springbootblog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    /*
    블로그 글 추가
     */
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
