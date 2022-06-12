package AssignmentTest;

import Assignment.HugeInteger.HugeIntegerSample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerSampleTest {
    private HugeIntegerSample hugeIntegerSample;
    private String firstString = "4294567890123856789692345671901834567899";
    private String secondString = "1234567890123456789012345678901234567890";

    @BeforeEach
    public void startWith() {
        hugeIntegerSample = new HugeIntegerSample();
    }

    @Test
    public void hugeIntegerCanBeCreated() {
        assertNotNull(hugeIntegerSample);
    }

    @Test
    public void parseStringToIntegerArrayTest() throws HugeIntegerSample.NotAnIntegerException {
        int[] result = hugeIntegerSample.parse(firstString);
        assertArrayEquals(new int[]{4, 2, 9, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 8, 5, 6, 7, 8, 9, 6, 9, 2, 3, 4, 5, 6, 7, 1, 9, 0, 1, 8, 3, 4, 5, 6, 7, 8, 9, 9}, result);

    }

    @Test
    public void parsedIntegerCanBeAddedTest() throws HugeIntegerSample.NotAnIntegerException {

        String result = hugeIntegerSample.addition(firstString, secondString);

        assertEquals("5529135780247313578704691350803069135789", result);
    }

    @Test
    public void subtractHugeIntegerTest() throws HugeIntegerSample.NotAnIntegerException {
        String result = hugeIntegerSample.subtraction(firstString, secondString);

        assertEquals("3060000000000400000679999993000600000009", result);
    }

    @Test
    public void canDetectZeroTest() throws HugeIntegerSample.NotAnIntegerException {
        String string = "0000000000000000000000000000000000000000";
        assertTrue(hugeIntegerSample.isZero(string));
    }

    @Test
    public void canDetectIfNotZeroTest() throws HugeIntegerSample.NotAnIntegerException {
       // String stringm = "60600000000000000000000000000000000000006";
        assertFalse(hugeIntegerSample.isZero(firstString));
    }
}
