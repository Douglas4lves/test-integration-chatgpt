package com.demo;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;

public class App 
{
    private static final String API_KEY = "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";


    public static void main( String[] args )
    {
        OpenAiService service = new OpenAiService(API_KEY);

        CompletionRequest request = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("Escreva um slogan para uma pizzaria")
                .maxTokens(100)
                .build();

        System.out.println(service.createCompletion(request).getChoices());

    }
}
