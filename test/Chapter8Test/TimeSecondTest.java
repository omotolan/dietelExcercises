package Chapter8Test;

import Chapter8.TimeSecond;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TimeSecondTest {
    private TimeSecond timeSecond;
    @BeforeEach
    public void startWith(){
        timeSecond = new TimeSecond(0);
    }
    @Test
    public void objectOfTimeSecondCanBeCreated(){
        assertNotNull(timeSecond);
    }
    @Test
    public void validateSecondTest(){
        timeSecond.setSecond(59);
        assertEquals(59, timeSecond.getSecond());
    }
    @Test
    public void getHourTest(){


        for (int i = 0; i < 86400; i++) {
timeSecond.tick();
        }
       // assertEquals(59, timeSecond.getSecond());
        assertEquals(12, timeSecond.getMinute());
        assertEquals(12, timeSecond.getHour());

    }
}
