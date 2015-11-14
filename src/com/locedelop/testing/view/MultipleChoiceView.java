package com.locedelop.testing.view;

import com.locedelop.testing.model.TestCase;
import com.locedelop.testing.presenter.TestingPresenter;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public interface MultipleChoiceView {
    void showTestCaseOnScreen(TestCase testCase);

    void setPresenter(TestingPresenter presenter);

    void startTest();
}
