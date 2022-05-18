package com.example.courseWork2.controller;

import com.example.courseWork2.exception.NotFoundException;
import com.example.courseWork2.service.impl.JavaQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/exam")
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {//создаем конструктор чтобы исп JavaQuestionService
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping("/java/add")
    public String add(@RequestParam(required = true) String question, @RequestParam(required = true) String answer) {
        return "Вопрос: " + javaQuestionService.addQuestion(question, answer) + " добавлен";
    }

    @GetMapping("/java/remove")
    public String remove(@RequestParam(required = true) String question, @RequestParam(required = true) String answer) throws NotFoundException {
        return "Вопрос: " + javaQuestionService.removeQuestion(question, answer) + " удален";
    }

    @GetMapping("/java")
    public String getAllQuestions() throws NotFoundException {
        return "Вопросы : " + javaQuestionService.getAllQuestions();

    }
}
