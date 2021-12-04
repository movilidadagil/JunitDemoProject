package testfactorial;

import exception.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestFactorial {
    @Test
    public void testFactorial() {
        try {
            Factorial.factorial(-4);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("negative n", e.getMessage());
        }
    }
}
