package com.sku.collaboration.project.domain.chat.dto.response;

import com.sku.collaboration.project.domain.chat.dto.Message;
import lombok.Data;
import java.util.List;

@Data
public class ChatResponse {
    private List<Choice> choices;

    @Data
    public static class Choice {
        private Message message;
    }
}