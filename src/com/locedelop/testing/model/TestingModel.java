package com.locedelop.testing.model;

import com.locedelop.testing.presenter.TestingPresenter;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public interface TestingModel {
    void initTest();

    void subscribeToUpdates(TestingPresenter subscriber);

    void checkUserAnswer(int answer);
}
