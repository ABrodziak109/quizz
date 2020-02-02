package com.example.quizz.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Data
public class QuestionDto {

    private Long id;
    private String answer;
    private String content;

    private List<String> option = new ArrayList<>();

    public QuestionDto(String content) {
        this.content = content;
    }

}
