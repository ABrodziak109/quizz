package com.example.quizz.controller;

import com.example.quizz.dto.TestDto;
import com.example.quizz.dto.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.quizz.repository.TestRepository;

@RestController// zwraca json,
@CrossOrigin //udostępnia zaptyania z zewnątrz, nie blokuje ich
@RequestMapping("/tests") // podaje ścieżkę, zapytanie które bedzie szło z tej sciezki trafi do controllera
public class TestController {

    @Autowired // wstrzykujemy beana, klasa musi byc beanem dla springa
    private TestMapper testMapper;

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/{id}")
    public TestDto sayHello(@PathVariable Long id){
        return testMapper.mapToTestDto(testRepository.findById(id).get());


    }


}
