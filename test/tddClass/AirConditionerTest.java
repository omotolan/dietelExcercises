package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void powerOnTest() {

        AirConditioner tolaniAir = new AirConditioner();
        tolaniAir.powerOn(true);
        assertTrue(tolaniAir.getOn());
    }

    @Test
    public void powerOffTest() {

        AirConditioner tolaniAir = new AirConditioner();
        tolaniAir.powerOff(false);
        assertFalse(tolaniAir.getOff());
    }

    @Test
    public void testIncreaseTemp() {
        AirConditioner tolaniAir = new AirConditioner();
        tolaniAir.increaseTemperature(12);
        assertEquals(16, tolaniAir.getIncrease());
    }

    @Test
    public void testDecreaseTemp() {
        AirConditioner tolaniAir = new AirConditioner();
        tolaniAir.decreaseTenperature(35);
        assertEquals(30, tolaniAir.getDecrease());
    }

    @Test
    public void testOverIncreaseTemp() {
        AirConditioner tolaniAir = new AirConditioner();
        tolaniAir.increaseTemperature(12);
        assertEquals(16, tolaniAir.getIncrease());
    }

    @Test
    public void testOverDecreaseTemp() {
        AirConditioner tolaniAir = new AirConditioner();
        tolaniAir.decreaseTenperature(35);
        assertEquals(30, tolaniAir.getDecrease());
    }

}