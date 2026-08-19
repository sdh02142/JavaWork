package omocha;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LMStudioClient {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:1234/v1/chat/completions";
        String jsonBody = """
            {
              "model": "qwen/qwen3.5-9b",
              "messages": [
                {"role": "user", "content": "응답 테스트하는 중이야. 뭔가 대답해줘."}
              ],
              "temperature": 0.7
            }
            """;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer lm-studio") // 임의 값 허용
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("응답 결과: " + response.body());
    }
}
