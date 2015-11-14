package com.locedelop.testing.presenter;

import com.locedelop.testing.model.TestCase;
import com.locedelop.testing.view.MultipleChoiceView;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public interface TestingPresenter {
    void startTest();

    void userAnswer(int answer);

    void setView(MultipleChoiceView view);

    void notifyNewQuestion(TestCase testCase);

    void resultNotify(double correctPercent);
}
