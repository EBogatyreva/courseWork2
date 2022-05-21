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
        Question expected = new Question("1", "2");
        examinerService.addQuestion("1", "2");

        when(examinerService.getRandomQuestion(1)).thenReturn(new Question("1","2"));
        assertEquals( new HashSet<>(Arrays.asList(new Question("1","2"))) , out.getQuestions(1));
    }
}
