package Chapter3Test;

import Chapter3.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DateTest {
    @Test
    public void dateCanBeCreatedTest(){
        Date date = new Date(0,0,0);
        assertNotNull(date);
    }
    @Test
    public void monthCanBeSetTest(){
        Date date = new Date(0,0,0);
        date.setMonth(3);
        assertEquals(3, date.getMonth());
    }
    @Test
    public void dayCanBeSetTest(){
        Date date = new Date(0,0,0);
        date.setDay(23);
        assertEquals(23, date.getDay());
    }
    @Test
    public void yearCanBeSetTest(){
        Date date = new Date(0,0,0);
        date.setYear(2003);
        assertEquals(2003, date.getYear());
    }
    @Test
    public void setDateCanBeDisplayedTest(){
        Date date = new Date(0,0,0);
        date.setMonth(4);
        date.setDay(22);
        date.setYear(2022);
        String result = date.displayDate();
        assertEquals("4/22/2022", result);
    }

}
