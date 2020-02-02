package com.example.quizz.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Answer extends EntityBase {

    @JoinColumn(name = "question_id")
    @ManyToOne
    private Question question;
    private String name;
    private boolean correct;

    public Answer(String name, boolean correct) {
        this.name = name;
        this.correct = correct;
    }

    public boolean isCorrect(){
        return correct;
    }



}
