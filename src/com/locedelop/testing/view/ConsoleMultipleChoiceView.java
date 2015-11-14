package com.locedelop.testing.view;

import com.locedelop.testing.model.TestCase;
import com.locedelop.testing.presenter.TestingPresenter;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class ConsoleMultipleChoiceView implements MultipleChoiceView {


    @Override
    public void showTestCaseOnScreen(TestCase testCase) {
        System.out.println(testCase.getQuestion());

        System.out.println();
        System.out.println("1) " + testCase.getAnswer1());
        System.out.println("2) " + testCase.getAnswer2());
        System.out.println("3) " + testCase.getAnswer3());
        System.out.println("4) " + testCase.getAnswer4());

        Scanner in = new Scanner(System.in);
        int answerNumber = in.nextInt();
        testingPresenter.userAnswer(answerNumber);
    }

    private TestingPresenter testingPresenter;
    @Override
    public void setPresenter(TestingPresenter presenter) {
        testingPresenter = presenter;
        testingPresenter.setView(this);
    }

    @Override
    public void startTest() {
        testingPresenter.startTest();
    }

    @Override
    public void showResult(double correctPercent) {
        System.out.println("-----------------");
        System.out.println("Your result: " + correctPercent + " %");
        System.out.println("-----------------");
    }

}
