package csc;

import java.util.Arrays;
import java.util.List;

import com.azure.ai.inference.ChatCompletionsClient;
import com.azure.ai.inference.ChatCompletionsClientBuilder;
import com.azure.ai.inference.models.ChatCompletions;
import com.azure.ai.inference.models.ChatCompletionsOptions;
import com.azure.ai.inference.models.ChatRequestMessage;
import com.azure.ai.inference.models.ChatRequestSystemMessage;
import com.azure.ai.inference.models.ChatRequestUserMessage;
import com.azure.core.credential.AzureKeyCredential;

public final class GBT {

    public static String input;
    public static String t;
    public static void gbt() {

        String key = ("api key");
        String endpoint = "https://models.inference.ai.azure.com";
        String model = "gpt-4o";

        ChatCompletionsClient client = new ChatCompletionsClientBuilder()
                .credential(new AzureKeyCredential(key))
                .endpoint(endpoint)
                .buildClient();

        List<ChatRequestMessage> chatMessages = Arrays.asList(
                new ChatRequestSystemMessage(""),
                new ChatRequestUserMessage(input)
        );

        ChatCompletionsOptions chatCompletionsOptions = new ChatCompletionsOptions(chatMessages);
        chatCompletionsOptions.setModel(model);

        ChatCompletions completions = client.complete(chatCompletionsOptions);
        t = completions.getChoice().getMessage().getContent();

        System.out.printf("%s.%n", completions.getChoice().getMessage().getContent());





    }
}

