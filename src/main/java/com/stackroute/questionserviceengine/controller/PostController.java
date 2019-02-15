package com.stackroute.questionserviceengine.controller;
import com.opencsv.bean.IterableCSVToBeanBuilder;
import com.stackroute.questionserviceengine.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import  com.stackroute.domain.Questions;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping(value="api/v1")
public class PostController {
    private QuestionService questionService;

    @Autowired
    public PostController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @RequestMapping(value = "questions")
    public ArrayList<Questions> listquestions(){
        System.out.println("List of Questions"+questionService.postQuestions());

        return questionService.postQuestions();
    }
//    @Autowired
//    public SaveCSVFileFromUser()


}
