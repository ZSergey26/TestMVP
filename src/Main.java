import com.locedelop.testing.model.TestCase;
import com.locedelop.testing.view.ConsoleMultipleChoiceView;
import com.locedelop.testing.view.MultipleChoiceView;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        TestCase testCase = TestCase.createSimpleTestCase();
        System.out.println(testCase);

        MultipleChoiceView view = new ConsoleMultipleChoiceView();
        view.showTestCaseOnScreen(testCase);
    }
}
