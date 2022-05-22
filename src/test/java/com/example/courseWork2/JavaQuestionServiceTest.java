package com.example.courseWork2;

import com.example.courseWork2.data.Question;
import com.example.courseWork2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.example.courseWork2.Constant.questions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {
    private final JavaQuestionService out = new JavaQuestionService();

    @org.junit.jupiter.api.Test
    void getEmployeeList() {
        out.addQuestion("Какие особенности есть у Java ", "ООП концепты, кроссплатформенность, высокая производительность, мультипоточность");
        out.addQuestion("Что такое наследование ", "Под наследованием подразумевается, что один класс может наследовать(“extends”) другой класс");
        out.addQuestion("Что такое инкапсуляция ", "Инкапсуляция — это сокрытие реализации при помощи модификаторов доступа, при помощи геттеров и сеттеров. Это делается для того, чтобы закрыть доступ для внешнего использования.");
        out.addQuestion("Что такое полиморфизм ", "Полиморфизм — это способность программы идентично использовать объекты с одинаковым интерфейсом без информации о конкретном типе этого объекта. Один интерфейс — множество реализаций.");
        out.addQuestion("Что такое Local Variable ", "Local variable — это переменная, которая определена внутри метода и существует вплоть до того момента, пока выполняется этот метод. Как только выполнение закончится, локальная переменная перестанет существовать.");
        assertTrue(out.getAllQuestions().containsAll(questions));
    }

    @org.junit.jupiter.api.Test
    void addQuestion() {
        out.addQuestion("1", "1");
        Question question1 = new Question("1", "1");
        assertTrue(out.getAllQuestions().contains(question1));
    }

    @org.junit.jupiter.api.Test
    void removeQuestion() {
        Question expected = new Question("1", "1");
        out.addQuestion("1", "1");
        assertEquals(expected, out.removeQuestion("1", "1"));
    }
}

