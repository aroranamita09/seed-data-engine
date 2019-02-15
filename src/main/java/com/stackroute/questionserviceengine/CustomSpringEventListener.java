package com.stackroute.questionserviceengine;

import com.stackroute.questionserviceengine.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {

    @Autowired
    QuestionRepository questionRepository;
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        System.out.println("Received spring custom event - " + event.getquestions());
        questionRepository.saveAll(event.getquestions());
    }
}

