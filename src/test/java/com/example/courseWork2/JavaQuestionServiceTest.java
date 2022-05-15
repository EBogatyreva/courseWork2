package com.example.courseWork2;

import com.example.courseWork2.data.Question;
import com.example.courseWork2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.courseWork2.Constant.questions;
import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceTest {
    @ExtendWith(MockitoExtension.class)
    class Test {
        @Mock
        private JavaQuestionService javaQuestionService;
        @InjectMocks
        private JavaQuestionService out;

        @org.junit.jupiter.api.Test
        void getEmployeeList() {
            assertEquals(questions, out.getAllQuestions());
        }

        @org.junit.jupiter.api.Test
        void addQuestion() {
            Question expected = new Question("1", "1");
            assertEquals(0, out.getAllQuestions().size());//мы так делаем всегда? проверяем размер на 0?
            assertFalse(out.getAllQuestions().contains(expected));
            String actual = out.addQuestion("1", "1");
            assertEquals(expected, actual);
            assertEquals(1, out.getAllQuestions().size());
            assertTrue(out.getAllQuestions().contains(expected));
        }

        @org.junit.jupiter.api.Test
        void removeQuestion() {
            Question expected = new Question("Какие особенности есть у Java ", "ООП концепты, кроссплатформенность, высокая производительность, мультипоточность");
            assertEquals(1, out.removeQuestion("Какие особенности есть у Java ", "ООП концепты, кроссплатформенность, высокая производительность, мультипоточность"));
            assertTrue(out.getAllQuestions().contains(expected));
            String actual = String.valueOf(out.removeQuestion("Какие особенности есть у Java ", "ООП концепты, кроссплатформенность, высокая производительность, мультипоточность"));
            assertEquals(expected, actual);
            assertTrue(out.getAllQuestions().isEmpty());
            assertFalse(out.getAllQuestions().contains(expected));
        }


    }
}
