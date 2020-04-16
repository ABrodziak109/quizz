package com.example.quizz.controller;

import com.example.quizz.dto.TestDto;
import com.example.quizz.dto.TestMapper;
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
    @ResponseBody
    public TestDto sayHello(@PathVariable Long id){
        return testMapper.mapToDto(testRepository.findById(id).get());


    }


}
