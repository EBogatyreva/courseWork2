package com.example.courseWork2.service.impl;

import com.example.courseWork2.data.Question;
import com.example.courseWork2.exception.BadRequest;
import com.example.courseWork2.exception.NotFoundException;
import com.example.courseWork2.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {
    Random r = new Random();
    private Set<Question> questions;

    public JavaQuestionService() {
        this.questions = new HashSet<>();
   }

    public int getSizeOfSet() {
        return questions.size();
    }

    @Override
    public String addQuestion(String question, String answer) {
        Question question1 = new Question(question, answer);
        if (questions.contains(question1)) {
            throw new BadRequest();
        }

        questions.add(new Question(question, answer));
        return "Вопрос/ответ внесены " + question + " " + answer;
    }

    @Override
    public String addQuestion(String question) {
        Question question2 = new Question(question, null);
        if (questions.contains(question2)) {
            throw new BadRequest();
        }
        questions.add(new Question(question));
        return "Вопрос внесен " + question;
    }

    @Override
    public Question removeQuestion(String question, String answer) throws NotFoundException {//сделать проверку если он идет вместе с ответом
        Question question3 = new Question(question, answer);
        if (!questions.contains(question3)) throw new NotFoundException();
        else questions.remove(question3);
        return question3;
    }

    @Override
    public Collection getAllQuestions() {
        return questions;
    }

    @Override
    public int getRandomQuestion(int max) {
        return r.nextInt(10) + 1;//так рандомное число возвращается)
    }
}