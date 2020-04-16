package com.example.quizz.dto;


import com.example.quizz.model.Answer;
import com.example.quizz.model.Question;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    public QuestionDto mapToQuestionDto(Question question) {

        QuestionDto questionDto = new QuestionDto(question.getContent());
        questionDto.setId(question.getId());

        List<Answer> answers = question.getAnswers();

        List<String> options = (List<String>) answers.stream()
                .map(s -> s.getName())
                .collect(Collectors.toList());
        questionDto.setOption(options);

        String answer = answers.stream()
                .filter(Answer::isCorrect)
                .map(Answer::getName)
                .collect(Collectors.joining());

        questionDto.setAnswer(answer);
        return questionDto;
    }

    public List<QuestionDto> mapToListQuestionDto(List<Question> questions){
        return questions.stream()
                .map(question -> mapToQuestionDto(question))
                .collect(Collectors.toList());
    }
}
