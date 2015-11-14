package com.locedelop.testing.model;

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
}
