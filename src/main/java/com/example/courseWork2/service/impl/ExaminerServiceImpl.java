package com.example.courseWork2.service.impl;

import com.example.courseWork2.data.Question;
import com.example.courseWork2.exception.BadRequest;
import com.example.courseWork2.service.ExaminerService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private JavaQuestionService questionService;

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> rndQuestionSet = new HashSet<>();

        int size = questionService.getSizeOfSet();
        if (amount > size) throw new BadRequest();

        while (rndQuestionSet.size() < amount) {
            rndQuestionSet.add(questionService.getRandomQuestion());
        }
        return rndQuestionSet;
    }

}
