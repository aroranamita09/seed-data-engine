package com.stackroute.questionserviceengine.service;

import com.stackroute.domain.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public class SaverServiceImpl {
    @Autowired
    QuestionService questionService;
    @Autowired
    MongoRepository<Questions,Integer> mongoRepository;

    public ArrayList<Questions> save(){
         ArrayList<Questions> questions=questionService.postQuestions();
       mongoRepository.saveAll(questions);
        System.out.println("In posting service"+ questions);
       return questions;

    }
}
