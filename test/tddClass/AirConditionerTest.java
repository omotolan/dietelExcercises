package tddClass;

import Classwork.AirCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void powerOnTest() {

        AirCondition tolaniAir = new AirCondition();
        tolaniAir.powerOn(true);
        assertTrue(tolaniAir.getOn());
    }

    @Test
    public void powerOffTest() {

        AirCondition tolaniAir = new AirCondition();
        tolaniAir.powerOff(false);
        assertFalse(tolaniAir.getOff());
    }

    @Test
    public void testIncreaseTemp() {
        AirCondition tolaniAir = new AirCondition();
        tolaniAir.increaseTemperature(12);
        assertEquals(16, tolaniAir.getIncrease());
    }

    @Test
    public void testDecreaseTemp() {
        AirCondition tolaniAir = new AirCondition();
        tolaniAir.decreaseTenperature(35);
        assertEquals(30, tolaniAir.getDecrease());
    }

    @Test
    public void testOverIncreaseTemp() {
        AirCondition tolaniAir = new AirCondition();
        tolaniAir.increaseTemperature(12);
        assertEquals(16, tolaniAir.getIncrease());
    }

    @Test
    public void testOverDecreaseTemp() {
        AirCondition tolaniAir = new AirCondition();
        tolaniAir.decreaseTenperature(35);
        assertEquals(30, tolaniAir.getDecrease());
    }

}