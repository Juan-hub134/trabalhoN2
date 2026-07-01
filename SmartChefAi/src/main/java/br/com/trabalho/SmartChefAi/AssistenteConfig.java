package br.com.trabalho.SmartChefAi;


import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AssistenteConfig {
    @Value("${geminai.api-key}")
    private String geminaiKey;

    @Value("${geminai.model}")
    private String geminaiModel;

    @Bean
    public GoogleAiGeminiChatModel googleAiGeminiChatModel() {
        return GoogleAiGeminiChatModel.builder()
                .apiKey(geminaiKey)
                .modelName(geminaiModel)
                .build();
            }
}
