package com.example.courseWork2.service;

import com.example.courseWork2.data.Question;
import com.example.courseWork2.exception.NotFoundException;

import java.util.Collection;

public interface QuestionService {

    String addQuestion(String question, String answer);

    Question removeQuestion(String question, String answer) throws NotFoundException;

    Collection<Question> getAllQuestions();

    Question getRandomQuestion();
}