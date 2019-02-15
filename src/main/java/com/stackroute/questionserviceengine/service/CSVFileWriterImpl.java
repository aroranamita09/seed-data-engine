//package com.stackroute.questionserviceengine.service;
//
//import java.io.FileWriter;
//import  com.stackroute.domain.Questions;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//public class CSVFileWriterImpl {
//    private static final String COMMA_DELIMITER = ",";
//    private static final String NEW_LINE_SEPARATOR = "\n";
//    private static final String FILE_HEADER = "questionId,questionTitle,questionDescription,inputFormat,outputFormat,difficulty,tags";
//    public static void writeCsvFile(String fileName) {
//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter(fileName);
//
//            //Write the CSV file header
//            fileWriter.append(FILE_HEADER.toString());
//            //Add a new line separator after the header
//            fileWriter.append(NEW_LINE_SEPARATOR);
//            for (Questions question : questions) {
//                fileWriter.append(String.valueOf(question.getQuestionId()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(question.getQuestionTitle());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(student.getLastName());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(student.getGender());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(student.getAge()));
//                fileWriter.append(NEW_LINE_SEPARATOR);
//            }
//    }
//}
