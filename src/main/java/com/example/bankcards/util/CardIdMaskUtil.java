package com.example.bankcards.util;

import org.springframework.stereotype.Component;

@Component
public class CardIdMaskUtil {

    public Integer execute(Long cardId) {
        return Math.toIntExact(cardId % 10000);
    }

}
