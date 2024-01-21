package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import parameter.Parameter;

public class SomeTest extends SubBaseTest {

    @Test
    void someTest(Parameter parameter) {
        Assertions.assertTrue(true);
    }
}
