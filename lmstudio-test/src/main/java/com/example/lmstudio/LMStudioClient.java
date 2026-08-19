package com.example.lmstudio;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LMStudioClient {

    public static void main(String[] args) throws Exception {

        // 1. 콘솔 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("질문 입력: ");
        String content = sc.nextLine();


        // 2. LM Studio 주소
        String url = "http://localhost:1234/v1/chat/completions";


        // 3. Java Map으로 JSON 구조 생성
        Map<String, Object> jsonMap = Map.of(
                "model", "qwen/qwen3.5-9b",

                "messages", List.of(
                        Map.of(
                                "role", "user",
                                "content", content
                        )
                ),

                "temperature", 0.7
        );


        // 4. Map → JSON 문자열
        ObjectMapper mapper = new ObjectMapper();

        String jsonBody =
                mapper.writeValueAsString(jsonMap);


        // JSON 확인
        System.out.println("\n전송할 JSON:");
        System.out.println(jsonBody);


        // 5. HTTP Client
        HttpClient client =
                HttpClient.newHttpClient();


        // 6. HTTP Request
        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .header(
                                "Content-Type",
                                "application/json"
                        )
                        .header(
                                "Authorization",
                                "Bearer lm-studio"
                        )
                        .POST(
                                HttpRequest.BodyPublishers
                                        .ofString(jsonBody)
                        )
                        .build();


        // 7. LM Studio에 전송
        HttpResponse<String> response =
                client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                );


        // 8. 응답 확인
        System.out.println("\nLM Studio 응답:");
        Map<String, Object> result =
                mapper.readValue(
                        response.body(),
                        new TypeReference<Map<String, Object>>() {}
                );

        List<Map<String, Object>> choices =
                (List<Map<String, Object>>) result.get("choices");

        Map<String, Object> choice = choices.get(0);

        Map<String, Object> message =
                (Map<String, Object>) choice.get("message");

        String content1 =
                (String) message.get("content");
        System.out.println(content1);

        sc.close();
    }
}