package test;

import com.locedelop.testing.presenter.ConcreteTestingPresenter;
import com.locedelop.testing.presenter.TestingPresenter;
import com.locedelop.testing.view.ConsoleMultipleChoiceView;
import com.locedelop.testing.view.MultipleChoiceView;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class MultipleChoiceViewTest {
    @Test
    public void multiplyChoice() {
        MultipleChoiceView view = new ConsoleMultipleChoiceView();

        TestingPresenter presenter = new ConcreteTestingPresenter();
        view.setPresenter(presenter);
        view.startTest();
    }
}
