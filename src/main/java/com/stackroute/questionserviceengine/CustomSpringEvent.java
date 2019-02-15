package com.stackroute.questionserviceengine;
import com.stackroute.domain.Questions;
import com.stackroute.questionserviceengine.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;

import java.util.List;

public class CustomSpringEvent extends ApplicationEvent {
    @Autowired
    private QuestionService questionService;

    public CustomSpringEvent(Object source, QuestionService questionService) {
        super(source);
        this.questionService = questionService;
    }
    public List<Questions> getquestions() {
        return questionService.postQuestions();
    }
}
