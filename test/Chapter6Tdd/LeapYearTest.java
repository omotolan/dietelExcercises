package Chapter6Tdd;

import Chapter6.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {
    @Test
    public void objectCanBeCreatedTest() {

    }

    @Test
    public void determineIfYearIsALeapYearTest() {
        boolean result = LeapYear.isLeapYear(2024);
        assertTrue(result);

    }
}
