package com.locedelop.testing.model;

import com.google.gson.Gson;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class TestCase {
    private String question;

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    private int correctAnswer;

    public TestCase(String question, String answer1, String answer2, String answer3, String answer4, int correctAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    public static TestCase createSimpleTestCase() {
        return new TestCase("_____ name is Robert", "Me", "I", "My", "He", 3);
    }



    @Override
    public String toString() {
        return "TestCase{" +
                "question='" + question + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestCase testCase = (TestCase) o;

        if (correctAnswer != testCase.correctAnswer) return false;
        if (question != null ? !question.equals(testCase.question) : testCase.question != null) return false;
        if (answer1 != null ? !answer1.equals(testCase.answer1) : testCase.answer1 != null) return false;
        if (answer2 != null ? !answer2.equals(testCase.answer2) : testCase.answer2 != null) return false;
        if (answer3 != null ? !answer3.equals(testCase.answer3) : testCase.answer3 != null) return false;
        return !(answer4 != null ? !answer4.equals(testCase.answer4) : testCase.answer4 != null);

    }

    @Override
    public int hashCode() {
        int result = question != null ? question.hashCode() : 0;
        result = 31 * result + (answer1 != null ? answer1.hashCode() : 0);
        result = 31 * result + (answer2 != null ? answer2.hashCode() : 0);
        result = 31 * result + (answer3 != null ? answer3.hashCode() : 0);
        result = 31 * result + (answer4 != null ? answer4.hashCode() : 0);
        result = 31 * result + correctAnswer;
        return result;
    }

    public static TestCase createFromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, TestCase.class);
    }
}
