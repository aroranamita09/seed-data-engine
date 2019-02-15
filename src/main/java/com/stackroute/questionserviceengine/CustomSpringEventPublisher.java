package com.stackroute.questionserviceengine;
import com.stackroute.questionserviceengine.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventPublisher {


    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void doStuffAndPublishAnEvent(final QuestionService questionService) {
        System.out.println("Publishing custom event. ");
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, questionService);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }
}

