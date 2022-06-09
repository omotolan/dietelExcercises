package Chapter6Tdd;

import Chapter6.PrimeNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {
    @Test
    public void objectCanBeCreatedTest(){

    }
    @Test
    public void primeNumberCanBeIdentifiedTest(){
       boolean result = PrimeNumbers.isPrimeNumber(11);
        assertTrue(result);
    }
}
