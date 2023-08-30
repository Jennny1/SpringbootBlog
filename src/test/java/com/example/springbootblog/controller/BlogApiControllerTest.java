/*
package com.example.springbootblog.controller;

import com.example.springbootblog.dto.AddArticleRequest;
import com.example.springbootblog.repository.BlogRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.context.WebApplicationContext;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // 테스트용 애플리케이션 컨텍스트
@AutoConfigureMockMvc // MockMvc 생성 및 자동 구성
class BlogApiControllerTest {

    @DisplayName("addArticle : 블로그 글 추가 성공")
    @Test
    public void addArticle() throws Exception {
        // Given : 필요한 요청 객체를 만듭니다.
        final String url = "/api/articles";
        final String title = "titme";
        final String content = "content";
        final AddArticleRequest userRequest = new AddArticleRequest(title, content);

        // 객체 JSON 으로 직렬화
        final String requestBody = objectMapper.writeValueAsString(userRequest);

        // When : Api 에 요청을 보냄. 이 때 요청 타입은 JSON이며, given절에서 미리 만들어둔 객체를 요청 본문으로 함꼐 보냄
        // 설정한 내용을 바탕으로 요청 전송
        ResultActions result = mockMvc.perform((url).contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(requestBody));

    }

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper; // 직렬화, 역직렬화를 위한 클래스

    @Autowired
    private WebApplicationContext context;

    @Autowired
    BlogRepository blogRepository;

    @BeforeEach // 테스트 실행 전 실행하는 메서드
    public void mockMvcSetUp(){
        this.mockMvc = MockMvcBuilder.webAppcontextSetup(context).build();
        blogRepository.deleteALl();

    }


    // then : 응답코드가  201created인지 확인. Blog를 전체 조회해 크기가 1인지 확인하고 실제로 저장한 데이터와 요청값을 비교한다.





}


*/
