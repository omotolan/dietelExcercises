package Chapter7Test;

import Chapter7.AirLineReservationSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirLineReservationSystemTest {
    private AirLineReservationSystem edoAirWays;
    @BeforeEach
    public void startWith(){
        edoAirWays = new AirLineReservationSystem();
    }
    @Test
    public void edoAirWaysCanBeCreatedTest(){
        assertNotNull(edoAirWays);
    }
    @Test
    public void isEmptyTest(){
        boolean result = edoAirWays.isFull();
        assertFalse(result);
    }
    @Test
    public void firstClassSeatCanBeAllocatedTest(){
        edoAirWays.setFirstClass();
        assertEquals(1, edoAirWays.getFirstClassSeats());
    }
    @Test
    public void economyClassSeatCanBeAllocatedTest(){
        edoAirWays.setEconomy();
        assertEquals(6, edoAirWays.getEconomySeats());
    }
    @Test
    public void isFullTest(){
        edoAirWays.setEconomy();
        edoAirWays.setEconomy();
        edoAirWays.setEconomy();
        edoAirWays.setEconomy();
        edoAirWays.setEconomy();
        edoAirWays.setFirstClass();
        edoAirWays.setFirstClass();
        edoAirWays.setFirstClass();
        edoAirWays.setFirstClass();
        edoAirWays.setFirstClass();
        boolean result = edoAirWays.isFull();
        assertTrue(result);
    }
}
