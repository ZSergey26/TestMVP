package com.locedelop.testing.view;

import com.locedelop.testing.model.TestCase;

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
    }

}
