package com.example.courseWork2;


import com.example.courseWork2.data.Question;
import com.example.courseWork2.service.impl.ExaminerServiceImpl;
import com.example.courseWork2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.courseWork2.Constant.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
private Constant constant;

    @Mock
    private JavaQuestionService examinerService;//заглушка над класом где находится метод getRandomQuestion
    @InjectMocks
    private ExaminerServiceImpl out;

    @org.junit.jupiter.api.Test
    void getQuestionsRandom() {

        when(examinerService.getAllQuestions()).thenReturn(questions);
        when(examinerService.getRandomQuestion(1)).thenReturn(new Question("1","2"));
        assertEquals( , out.getQuestions(1));  //здесь в ожидаемом - что будет возвращать сервис , если коллекция строк, то коллекция строк

/*      Random r = new Random();
        int amount = 3;
        Question[] arr = new Question[questions.size()];
        Question[] arr1 = new Question[questions.size()];
        questions.toArray(value -> arr);//нужно пояснение)) value -> arr

        for (int i = 0; i < amount; i++) {
            int item = r.nextInt(3) + 1;
            arr1[i] = arr[item];
            System.out.println(arr1[i]);
        }
        assertNotNull(arr1);*/
    }
}
