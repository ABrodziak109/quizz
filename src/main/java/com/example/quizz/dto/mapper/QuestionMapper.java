package com.example.quizz.dto.mapper;

import com.example.quizz.dto.QuestionDto;
import com.example.quizz.model.Answer;
import com.example.quizz.model.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class QuestionMapper {

    public QuestionDto mapToQuestionDto(Question question){
        QuestionDto questionDto = new QuestionDto(question.getContent());
        questionDto.setId(question.getId());

        List<Answer> answers = question.getAnswers();

        List<String> answerName = new ArrayList<>();
        for (int i =0; i< answerName.size(); i++) {
            answerName.add(answers.get(i).getName());
        }

        List<String> answersName2 = answers.stream()
                .map(x-> x.getName())
                .collect(Collectors.toList());

        questionDto.setOption(answersName2);

        String correctAnswer = "";
        for (int i = 0; i < answers.size(); i++) {
            if(answers.get(i).isCorrect()) {
                correctAnswer = answers.get(i).getName();

            }
        }

        questionDto.setAnswer(correctAnswer);
        return questionDto;

    }

    public  List<QuestionDto> mapToListQuestionDto(List<Question> questions) {
        return questions.stream()
                .map(question -> mapToQuestionDto(question))
                .collect(Collectors.toList());
    }
}
