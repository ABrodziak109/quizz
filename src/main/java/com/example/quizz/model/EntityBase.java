package com.example.quizz.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass //dziedziczenie w bazie

public class EntityBase {
    // stworzyliśmy główną matkę po której bedziemy dziedziczyć, musimy mieć id i generatedValue
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //strategia generowania
    private Long id;
}
