package com.example.courseWork2;

import com.example.courseWork2.data.Question;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Constant {//почему ненужно заполнять?
    public static final Set<Question> questions = new HashSet<>(List.of(
            new Question("Какие особенности есть у Java ", "ООП концепты, кроссплатформенность, высокая производительность, мультипоточность"),
            new Question("Что такое наследование ", "Под наследованием подразумевается, что один класс может наследовать(“extends”) другой класс"),
            new Question("Что такое инкапсуляция ", "Инкапсуляция — это сокрытие реализации при помощи модификаторов доступа, при помощи геттеров и сеттеров. Это делается для того, чтобы закрыть доступ для внешнего использования."),
            new Question("Что такое полиморфизм ", "Полиморфизм — это способность программы идентично использовать объекты с одинаковым интерфейсом без информации о конкретном типе этого объекта. Один интерфейс — множество реализаций."),
            new Question("Что такое полиморфизм ", "Полиморфизм — это способность программы идентично использовать объекты с одинаковым интерфейсом без информации о конкретном типе этого объекта. Один интерфейс — множество реализаций."),
            new Question("Что такое Local Variable ", "Local variable — это переменная, которая определена внутри метода и существует вплоть до того момента, пока выполняется этот метод. Как только выполнение закончится, локальная переменная перестанет существовать.")));

