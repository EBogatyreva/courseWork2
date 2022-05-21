package com.example.courseWork2.service;

import com.example.courseWork2.data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
