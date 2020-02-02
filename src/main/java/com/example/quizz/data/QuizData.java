package com.example.quizz.data;


import com.example.quizz.model.Answer;
import com.example.quizz.model.Question;
import com.example.quizz.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.quizz.repository.TestRepository;

@Component
public class QuizData implements CommandLineRunner {

    @Autowired
    TestRepository testRepository;

    @Override
    public void run (String... args) throws Exception{

        Test test = new Test("About everything");

        
        test.addQuestion(question);
        test.addQuestion(question2);
        test.addQuestion(question3);
        test.addQuestion(question4);
        testRepository.save(test);
    }
}
