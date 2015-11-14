package test;

import com.locedelop.testing.model.TestCase;
import org.junit.Test;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class TestingTest {

    @Test
    public void simpleTestCreation() {
        org.junit.Assert.assertNotNull("should not be null", TestCase.createSimpleTestCase());
    }
}
