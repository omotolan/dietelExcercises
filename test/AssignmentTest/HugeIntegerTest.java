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
    public void startWith(){
        hugeInteger = new HugeInteger();
    }
    @Test
    public void hugeIntegerCanBeCreated(){
        assertNotNull(hugeInteger);
    }
@Test
    public void parseStringToIntegerArrayTest(){
      // int[] result = hugeInteger.parse(firstString);
      // assertArrayEquals(result, result);
  //  System.out.println(Arrays.toString(result));
}
@Test
    public void parsedIntegerCanBeAddedTest() throws HugeInteger.NotAnIntegerException {
        String firstString = "4294567897123856789692345671931834567899";
   // String firstString =   "1111111111111111111111111111111111111111";
    String secondString = "1234567892123456789512345678931234567892";
        String result = hugeInteger.addition(firstString,secondString);

    assertEquals(36, result);
}
}
