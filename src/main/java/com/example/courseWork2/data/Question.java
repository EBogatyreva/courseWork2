package com.example.courseWork2.data;

import java.util.Objects;

public class Question implements QuestionInterface {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public Question(String question) {
        this.question = question;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getAnswer() {
        return answer;
    }


    @Override
    public String toString() {
        return "{" + " Вопрос='" + getQuestion() + '\'' +
                " Ответ=" + getAnswer() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }

    @Override
    public boolean equals(Object obj) {
        Question question = (Question) obj;
        if (this == question) {
            return true;
        } else if ((this.question.equals(question.getQuestion())) &&
                (this.answer.equals(question.getAnswer()))) {
            return true;
        } else
            return false;
    }

}
