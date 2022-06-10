package Chapter6Tdd;

import Chapter6.SumOfDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {
    @Test
    public void objectCanBeCreatedTest() {

    }

    @Test
    public void digitsCanBeCalculatedTest() {
        int result = SumOfDigits.sumOfDigits(7232);
        assertEquals(14, result);
    }
}
