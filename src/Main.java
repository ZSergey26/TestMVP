import com.locedelop.testing.model.TestCase;
import com.locedelop.testing.presenter.ConcreteTestingPresenter;
import com.locedelop.testing.presenter.TestingPresenter;
import com.locedelop.testing.view.ConsoleMultipleChoiceView;
import com.locedelop.testing.view.MultipleChoiceView;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        MultipleChoiceView view = new ConsoleMultipleChoiceView();

        TestingPresenter presenter = new ConcreteTestingPresenter();
        view.setPresenter(presenter);
        view.
    }
}
