package com.locedelop.testing.model;

import com.locedelop.testing.presenter.TestingPresenter;

import java.util.ArrayList;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class EngTestModel implements TestingModel {

    private int questionsCount;
    private ArrayList<TestCase> testCases;
    public EngTestModel() {
        testCases = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            testCases.add(TestCase.createSimpleTestCase());
        }

        questionsCount = testCases.size();
    }

    private int currentQuestion;
    @Override
    public void initTest() {
        subscriber.notifyNewQuestion(testCases.get(currentQuestion));
    }

    private TestingPresenter subscriber;
    @Override
    public void subscribeToUpdates(TestingPresenter subscriber) {
        this.subscriber = subscriber;
    }

    int correctAnswersCount;
    @Override
    public void checkUserAnswer(int userAnswer) {
        if (testCases.get(currentQuestion).getCorrectAnswer() == userAnswer)
            correctAnswersCount++;

        currentQuestion++;
        if (currentQuestion >= questionsCount) {
            double correctPercent = (double) correctAnswersCount / questionsCount * 100.0;
            subscriber.resultNotify(correctPercent);
            return;
        }
        subscriber.notifyNewQuestion(testCases.get(currentQuestion));
    }
}
