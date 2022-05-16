package com.example.courseWork2;

import com.example.courseWork2.service.impl.ExaminerServiceImpl;
import com.example.courseWork2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.courseWork2.Constant.questions;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private ExaminerServiceImpl examinerService;
    @InjectMocks
    private JavaQuestionService out;

    @org.junit.jupiter.api.Test
    void getQuestionsRandom() {
        assertEquals(expected, out.getRandomQuestion(3));
    }

}
