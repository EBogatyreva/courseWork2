package com.example.courseWork2.controller;

import com.example.courseWork2.data.Question;
import com.example.courseWork2.service.impl.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/get")
public class ExamController {
    private final ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/all")
    public Collection<Question> getQuestions(@RequestParam(required = true) int amount) {
        return examinerService.getQuestions(amount);
    }
}
