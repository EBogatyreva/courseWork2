package com.example.courseWork2.service.impl;

import com.example.courseWork2.data.Question;
import com.example.courseWork2.exception.BAD_REQUEST;
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
    private Set<Question> questions;//уникальное множество

    public JavaQuestionService() {
        this.questions = new HashSet<>();
        questions.add(new Question("Какие особенности есть у Java ", "ООП концепты, кроссплатформенность, высокая производительность, мультипоточность"));
        questions.add(new Question("Что такое наследование ", "Под наследованием подразумевается, что один класс может наследовать(“extends”) другой класс"));
        questions.add(new Question("Что такое инкапсуляция ", "Инкапсуляция — это сокрытие реализации при помощи модификаторов доступа, при помощи геттеров и сеттеров. Это делается для того, чтобы закрыть доступ для внешнего использования."));
        questions.add(new Question("Что такое полиморфизм ", "Полиморфизм — это способность программы идентично использовать объекты с одинаковым интерфейсом без информации о конкретном типе этого объекта. Один интерфейс — множество реализаций."));
        questions.add(new Question("Что такое Local Variable ", "Local variable — это переменная, которая определена внутри метода и существует вплоть до того момента, пока выполняется этот метод. Как только выполнение закончится, локальная переменная перестанет существовать."));
    }

    public int getSizeOfSet() {
        return questions.size();
    }
    @Override
    public String addQuestion(String question, String answer) {
        Question question1 = new Question(question, answer);
        if (questions.contains(question1)) {
            throw new BAD_REQUEST();
        }

        questions.add(new Question(question, answer));
        return "Вопрос/ответ внесены " + question + " " + answer;
    }

    @Override
    public String addQuestion(String question) {
        Question question2 = new Question(question, null);
        if (questions.contains(question2)) {
            throw new BAD_REQUEST();
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
        return r.nextInt((int) (Math.random() * max));
    }
}