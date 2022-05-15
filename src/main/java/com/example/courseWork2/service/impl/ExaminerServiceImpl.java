package com.example.courseWork2.service.impl;

import com.example.courseWork2.service.ExaminerService;

public class ExaminerServiceImpl implements ExaminerService {
    private JavaQuestionService questionService;

    @Override//уф я тут зависла
    public String[] getQuestions(int amount) {
        String[] arr = new String[questionService.getSizeOfSet()];
        questionService.getAllQuestions();
        String[] arr1 = new String[amount];

        for (int i = 0; i < amount; i++) {
            int item = questionService.getRandomQuestion(amount);
            arr1[i] = arr[item];
        }
        return arr1;
    }

}
