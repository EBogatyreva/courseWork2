package com.example.courseWork2;


import com.example.courseWork2.data.Question;
import com.example.courseWork2.service.impl.ExaminerServiceImpl;
import com.example.courseWork2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashSet;

import static com.example.courseWork2.Constant.questions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService examinerService;
    @InjectMocks
    private ExaminerServiceImpl out;

    @org.junit.jupiter.api.Test
    void getQuestionsRandom() {
        Question ques = new Question("1", "2");
        when(examinerService.getSizeOfSet()).thenReturn(1);
        when(examinerService.getRandomQuestion()).thenReturn(ques);
        assertEquals(new HashSet<>(Arrays.asList(new Question("1", "2"))), out.getQuestions(1));
    }
}
