package omocha;

import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class OllamaJavaClient {
    public static void main(String[] args) {
        // Ollama API 주소 및 설정
        String url = "http://localhost:11434/api/generate";
        String modelName = "qwen3:14b-custom"; // 사용 중인 Ollama 모델명 입력
        String prompt = "이 문장은 거짓이다. 옆의 문장의 참 거짓을 판단해줘";

        // JSON 요청 본문 생성 (스트리밍 비활성화: "stream": false)
        String jsonBody = String.format(
            "{\"model\": \"%s\", \"prompt\": \"%s\", \"stream\": false}",
            modelName, prompt
        );

        // HttpClient 및 HttpRequest 빌드
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody, StandardCharsets.UTF_8))
                .build();

        try {
            // 동기 방식으로 응답 받기
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            
            if (response.statusCode() == 200) {
            	String res = response.body();
            	
//            	String target = "\",\"respons\":\"";
//            	int num = target.length();
//            	System.out.println(num);
//                int start = res.indexOf(target);
//                
//                String value2 = res.substring(start);
//                
//                // key2 값의 끝 위치 (key3 시작 위치 직전의 따옴표)
//                int end = res.indexOf("\",\"thinking\":\"");
//
//                value2 = res.substring(end, 0);
            	
            	
                System.out.println("--- Ollama 응답 완료 ---");
                System.out.println(res);
            } else {
            	String res = response.body();
                System.out.println("오류 발생! HTTP 상태 코드: " + response.statusCode());
                System.out.println("응답 내용: " + res);
            }
        } catch (Exception e) {
            System.err.println("API 호출 중 예외가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
