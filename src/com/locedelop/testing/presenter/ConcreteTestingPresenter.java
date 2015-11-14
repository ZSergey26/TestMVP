package com.locedelop.testing.presenter;

import com.locedelop.testing.model.EngTestModel;
import com.locedelop.testing.model.TestCase;
import com.locedelop.testing.model.TestingModel;
import com.locedelop.testing.view.MultipleChoiceView;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class ConcreteTestingPresenter implements TestingPresenter {


    @Override
    public void startTest() {
        model.initTest();
    }

    @Override
    public void userAnswer(int answer) {
        model.checkUserAnswer(answer);
    }

    private MultipleChoiceView view;
    private TestingModel model;
    @Override
    public void setView(MultipleChoiceView view) {
        this.view = view;

        model = new EngTestModel();
        model.subscribeToUpdates(this);
    }

    @Override
    public void notifyNewQuestion(TestCase testCase) {
        view.showTestCaseOnScreen(testCase);
    }

    @Override
    public void resultNotify(double correctPercent) {
        view.showResult(correctPercent);
    }
}
