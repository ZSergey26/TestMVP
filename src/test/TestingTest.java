package test;

import com.locedelop.testing.model.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sergei Zarochentsev on 14.11.2015.
 */
public class TestingTest {

    @Test
    public void simpleTestCreation() {
        assertNotNull("should not be null", TestCase.createSimpleTestCase());
    }

    @Test
    public void createFromJSON() {
        TestCase expectedTestCase = TestCase.createSimpleTestCase();

        String json = "{\n" +
                "\t\"question\" : \"_____ name is Robert\",\n" +
                "\t\"answer1\"  : \"Me\",\n" +
                "\t\"answer2\"  : \"I\",\n" +
                "\t\"answer3\"  : \"My\",\n" +
                "\t\"answer4\"  : \"He\",\n" +
                "\t\"correctAnswer\" : 3\n" +
                "}";

        TestCase jsonTestCase = TestCase.createFromJson(json);

        assertEquals("Must be equals", expectedTestCase, jsonTestCase);
    }
}
