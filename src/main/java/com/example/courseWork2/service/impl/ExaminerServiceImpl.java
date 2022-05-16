package com.example.courseWork2.service.impl;

import com.example.courseWork2.exception.BadRequest;
import com.example.courseWork2.service.ExaminerService;
import org.springframework.stereotype.Service;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private JavaQuestionService questionService;

    @Override
    public String[] getQuestions(int amount) {
        String[] arr = new String[questionService.getSizeOfSet()];
        questionService.getAllQuestions();
        String[] arr1 = new String[amount];

        for (int i = 0; i < amount; i++) {
            int item = questionService.getRandomQuestion(amount);
            if (item > questionService.getAllQuestions().size()) throw new BadRequest();
            arr1[i] = arr[item];
        }
        return arr1;
    }

}
