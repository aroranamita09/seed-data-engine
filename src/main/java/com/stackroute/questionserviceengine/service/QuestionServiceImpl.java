package com.stackroute.questionserviceengine.service;
import com.opencsv.CSVReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.stackroute.questionserviceengine.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.domain.Questions;
import java.io.*;
import java.util.ArrayList;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final ArrayList<Questions> questions;

    @Autowired
    private QuestionRepository questionRepository;

    public QuestionServiceImpl()
    {
        questions=new ArrayList<>(); }

    public   ArrayList<Questions> postQuestions() {
        FileInputStream fis = null;
        try {
            String filename = "/home/user/Desktop/question-service-engine-test/src/main/resources/finalCSV.csv";
            fis = new FileInputStream(new File(filename));
            System.out.println("In fis"+fis);
            CSVReader reader = new CSVReader(new InputStreamReader(fis));
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {

                Questions newQuestion = new Questions(Integer.valueOf(nextLine[0]), nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], nextLine[6], nextLine[7]);
                System.out.println(newQuestion);
                questions.add(newQuestion);
                questionRepository.saveAll(questions);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuestionServiceImpl.class.getName()).log(Level.SEVERE, "Error aa gea", ex);
        } catch (IOException ex) {
            Logger.getLogger(QuestionServiceImpl.class.getName()).log(Level.SEVERE, "hie severe error", ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(QuestionServiceImpl.class.getName()).log(Level.SEVERE, "bhootni", ex);
            }
        }
        return questions;
    }}

