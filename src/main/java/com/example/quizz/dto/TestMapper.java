package com.example.quizz.dto;


import com.example.quizz.model.Test;
import org.springframework.stereotype.Component;

@Component
public class TestMapper {

    private QuestionMapper questionMapper = new QuestionMapper();

    public TestDto mapToDto(Test test) {
        TestDto testDto = new TestDto();

        testDto.setName(test.getName());

        testDto.setQuestions(questionMapper.mapToListQuestionDto(test.getQuestions()));
        return testDto;
    }

}
