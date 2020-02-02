package com.example.quizz.repository;


import com.example.quizz.model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepository extends CrudRepository<Test, Long > {


}
