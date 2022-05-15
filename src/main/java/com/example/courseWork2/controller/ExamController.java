package com.example.courseWork2.controller;

import com.example.courseWork2.service.impl.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class ExamController {
    private final ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }


    @GetMapping("/all")
    public String getQuestions(@RequestParam(required = true) int amount) {
        return "Вопросы: " + examinerService.getQuestions(amount);
    }
}
