package AssignmentTest;

import Assignment.HugeInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HugeIntegerTest {

    private String firstString = "4294567890123856789692345671901834567899";
    private String secondString = "1234567890123456789012345678901234567890";
    private HugeInteger hugeInteger;

    @BeforeEach
    public void startWith() throws HugeInteger.NotAnIntegerException {
        hugeInteger = new HugeInteger(firstString);
    }

    @Test
    public void hugeIntegerObjectCanBeCreatedTest() {
        assertNotNull(hugeInteger);
    }

    @Test
    public void stringCanBeParsedToArrayIntegerTest() throws HugeInteger.NotAnIntegerException {
        hugeInteger.parse(firstString);
        assertEquals("4294567890123856789692345671901834567899", hugeInteger.toString());
    }

    @Test
    public void stringOfHugeIntegerCaBeAddedTest() throws HugeInteger.NotAnIntegerException {
        HugeInteger hugeInteger1 = new HugeInteger(secondString);
        HugeInteger hugeInteger2 = hugeInteger.add(hugeInteger1);
        String result = hugeInteger2.toString();
        assertEquals("5529135780247313578704691350803069135789", result);

    }
}
