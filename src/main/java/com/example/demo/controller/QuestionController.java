package com.example.demo.controller;


import com.example.demo.model.Question;
import com.example.demo.repository.AnswerRepo;
import com.example.demo.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepo questionRepo;
    @Autowired
    AnswerRepo answerRepo;

    @PostMapping("/question")
    public Question addQus(@RequestBody Question question){
        questionRepo.save(question);
        return question;
    }

}
