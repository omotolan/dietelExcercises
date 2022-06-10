package AssignmentTest;

import Assignment.HugeInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    private HugeInteger hugeInteger;
    private String firstString = "4294567890123856789692345671901834567899";
    private String secondString = "1234567890123456789012345678901234567890";

    @BeforeEach
    public void startWith() {
        hugeInteger = new HugeInteger();
    }

    @Test
    public void hugeIntegerCanBeCreated() {
        assertNotNull(hugeInteger);
    }

    @Test
    public void parseStringToIntegerArrayTest() throws HugeInteger.NotAnIntegerException {
        int[] result = hugeInteger.parse(firstString);
        assertArrayEquals(new int[]{4, 2, 9, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 8, 5, 6, 7, 8, 9, 6, 9, 2, 3, 4, 5, 6, 7, 1, 9, 0, 1, 8, 3, 4, 5, 6, 7, 8, 9, 9}, result);

    }

    @Test
    public void parsedIntegerCanBeAddedTest() throws HugeInteger.NotAnIntegerException {

        String result = hugeInteger.addition(firstString, secondString);

        assertEquals("5529135780247313578704691350803069135789", result);
    }

    @Test
    public void subtractHugeIntegerTest() throws HugeInteger.NotAnIntegerException {
        String result = hugeInteger.subtraction(firstString, secondString);

        assertEquals("3060000000000400000679999993000600000009", result);
    }
}
