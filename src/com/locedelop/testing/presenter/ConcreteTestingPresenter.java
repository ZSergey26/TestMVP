package com.locedelop.testing.presenter;

import com.locedelop.testing.view.MultipleChoiceView;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class ConcreteTestingPresenter implements TestingPresenter {
    p

    @Override
    public void startTest() {

    }

    @Override
    public void userAnswer(int answer) {

    }

    private MultipleChoiceView view;
    @Override
    public void setView(MultipleChoiceView view) {
        this.view = view;
    }
}
