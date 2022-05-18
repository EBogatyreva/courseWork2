package com.example.courseWork2;


import com.example.courseWork2.data.Question;
import com.example.courseWork2.service.impl.ExaminerServiceImpl;
import com.example.courseWork2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static com.example.courseWork2.Constant.questions;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionService examinerService;//заглушка над класом где находится метод getRandomQuestion, но в тесте я его не исп
    @InjectMocks
    private ExaminerServiceImpl out;//тож не исп

    @org.junit.jupiter.api.Test
    void getQuestionsRandom() {

        Random r = new Random();
        int amount = 3;
        Question[] arr = new Question[questions.size()];
        Question[] arr1 = new Question[questions.size()];
        questions.toArray(value -> arr);//нужно пояснение)) value -> arr

        for (int i = 0; i < amount; i++) {
            int item = r.nextInt(3) + 1;
            arr1[i] = arr[item];
            System.out.println(arr1[i]);
        }
        assertNotNull(arr1);
    }
}
