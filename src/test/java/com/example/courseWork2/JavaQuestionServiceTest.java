package com.example.courseWork2;

import com.example.courseWork2.data.Question;
import com.example.courseWork2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


import static com.example.courseWork2.Constant.questions;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {

    private final JavaQuestionService out = new JavaQuestionService();

    @org.junit.jupiter.api.Test
    void getEmployeeList() {
        assertEquals(questions, out.getAllQuestions());
    }

    @org.junit.jupiter.api.Test
    void addQuestion() {
        Question expected = new Question("1", "1");
        assertEquals(expected, out.addQuestion("1", "1"));
    }

    @org.junit.jupiter.api.Test
    void removeQuestion() {
        Question expected = new Question("1", "1");
        out.addQuestion("1", "1");
        assertEquals(expected, out.removeQuestion("1", "1"));
    }
}

