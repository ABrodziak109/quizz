package com.example.quizz.dto.mapper;

import com.example.quizz.dto.TestDto;
import com.example.quizz.model.Test;
import org.springframework.stereotype.Component;

@Component //adnotacja ogólna, jeśli nie wiemy co postawić wybieramy component
public class TestMapper {

    private QuestionMapper questionMapper = new QuestionMapper();

    public TestDto mapToTestDto(Test test){
        TestDto testDto = new TestDto();
        testDto.setName(test.getName());
        testDto.setQuestions(questionMapper.mapToListQuestionDto(test.getQuestions()));

        return testDto;
    }
}
