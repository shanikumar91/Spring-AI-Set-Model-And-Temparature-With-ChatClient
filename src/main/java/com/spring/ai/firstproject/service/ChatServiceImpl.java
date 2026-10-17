package com.spring.ai.firstproject.service;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService{

    private ChatClient chatClient;

    public ChatServiceImpl(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String chat(String query){
//        Prompt prompt1 = new Prompt(query, OllamaChatOptions.builder()
//                .model("codellama:latest")
//                .temperature(0.7)
//                .maxTokens(100)
//                .build());

                Prompt prompt1 = new Prompt(query);
        var content = chatClient.
                prompt(prompt1)
                .call()
                .content();
        return content;

    }
}
