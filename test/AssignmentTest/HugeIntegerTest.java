package AssignmentTest;

import Assignment.HugeInteger.HugeInteger;
import Assignment.HugeInteger.NotAnIntegerException;
import Assignment.HugeInteger.ValueLengthGreaterThanForty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    private final String firstString = "4294567890123856789692345671901834567899";
    private final String secondString = "1234567890123456789012345678901234567890";
    private HugeInteger hugeInteger;

    @BeforeEach
    public void startWith() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        hugeInteger = new HugeInteger(firstString);
    }

    @Test
    public void hugeIntegerObjectCanBeCreatedTest() {
        assertNotNull(hugeInteger);
    }

    @Test
    public void stringCanBeParsedToArrayIntegerTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        hugeInteger.parse(firstString);
        assertEquals("4294567890123856789692345671901834567899", hugeInteger.toString());
    }

    @Test
    public void hugeIntegerCanPerformAdditionTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        HugeInteger hugeInteger1 = new HugeInteger(secondString);
        HugeInteger hugeInteger2 = hugeInteger.add(hugeInteger1);
        String result = hugeInteger2.toString();
        assertEquals("5529135780247313578704691350803069135789", result);

    }

    @Test
    public void hugeIntegerCanPerformSubtractionTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        HugeInteger hugeInteger1 = new HugeInteger(secondString);
        HugeInteger hugeInteger2 = hugeInteger.subtract(hugeInteger1);
        String result = hugeInteger2.toString();
        assertEquals("3060000000000400000679999993000600000009", result);
    }

    @Test
    public void hugeIntegerIsEqualToAnotherHugeIntegerTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "1111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isEqualTo(hugeInteger2);
        assertTrue(result);
    }

    @Test
    public void methodHugeIntegerIsEqualToAnotherHugeIntegerDoesNotWorkOtherWayTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "2111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isEqualTo(hugeInteger2);
        assertFalse(result);
    }

    @Test
    public void hugeIntegerIsNotEqualToAnotherHugeIntegerTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "2111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isNotEqualTo(hugeInteger2);
        assertTrue(result);
    }

    @Test
    public void methodHugeIntegerIsNotEqualToAnotherHugeIntegerDoesNotWorkOtherWayTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "1111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isNotEqualTo(hugeInteger2);
        assertFalse(result);
    }

    @Test
    public void hugeIntegerIsGreaterThanAnotherHugeIntegerTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "2111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isGreaterThan(hugeInteger2);
        assertTrue(result);
    }

    @Test
    public void hugeIntegerIsGreaterThanAnotherHugeIntegerDoesNotWorkOtherWayTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "1111111111111111111111111111111111111111";
        String secondString = "2111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isGreaterThan(hugeInteger2);
        assertFalse(result);
    }

    @Test
    public void hugeIntegerIsLessThanAnotherHugeIntegerTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "2111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger2.isLessThan(hugeInteger1);
        assertTrue(result);
    }

    @Test
    public void hugeIntegerIsLessThanAnotherHugeIntegerDoesNotWorkOtherWayTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "2111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isLessThan(hugeInteger2);
        assertFalse(result);
    }

    @Test
    public void isGreaterThanOrEqualToTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "2111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isGreaterThanOrEqualTo(hugeInteger2);
        assertTrue(result);
    }

    @Test
    public void isLessThanOrEqualToTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
        String firstString = "0111111111111111111111111111111111111111";
        String secondString = "1111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        boolean result = hugeInteger1.isLessThanOrEqualTo(hugeInteger2);
        assertTrue(result);
    }

    @Test
    public void multiplyTest() throws ValueLengthGreaterThanForty, NotAnIntegerException {
       // yet to crack
        String firstString = "2111111111111111111111111111111111111111";
        String secondString = "2111111111111111111111111111111111111111";
        HugeInteger hugeInteger1 = new HugeInteger(firstString);
        HugeInteger hugeInteger2 = new HugeInteger(secondString);
        HugeInteger hugeInteger3 = hugeInteger1.multiply(hugeInteger2);
        assertEquals("", hugeInteger3.toString());
    }
}
