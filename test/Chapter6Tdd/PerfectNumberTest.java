package Chapter6Tdd;

import Chapter6.PerfectNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectNumberTest {
    @Test
    public void objectCanBeCreatedTest() {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        assertNotNull(perfectNumbers);
    }

    @Test
    public void perfectNumberCanBeDeterminedTest() {
        boolean result = PerfectNumbers.isPerfect(6);
        assertTrue(result);
    }
}
