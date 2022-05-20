package tddClass;

import Classwork.AutomaticBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void startBikeTest() {
        //given
        AutomaticBike tjayBike = new AutomaticBike();
        //when
        tjayBike.powerBikeOn();
        //assert
        assertTrue(tjayBike.isOn());
    }

    @Test
    public void offBikeTest() {
        //given
        AutomaticBike tjayBike = new AutomaticBike();
        tjayBike.powerBikeOn();
        //given
        tjayBike.powerOffBike();
        //assert
        assertFalse(tjayBike.isOn());
    }

    @Test
    public void accelerationTest() {
        AutomaticBike tjayBike = new AutomaticBike();
        for (int i = 0; i < 20; i++) {
            tjayBike.accelerate(i);
            
        }
        assertEquals(20, tjayBike.speed());
    }

    @Test
    public void accelerationTestForGear2() {
        AutomaticBike tjayBike = new AutomaticBike();
        int speed = 0;
        for (int i = 0; i < 29; i++) {
            tjayBike.accelerate(i);
            speed += tjayBike.speed();
            if (speed > 20 ){
                i = 2;
                tjayBike.accelerate(i);
            }
            
        }
        assertEquals(30, tjayBike.speed());
    }

    @Test
    public void accelerationTestForGear3() {
        AutomaticBike tjayBike = new AutomaticBike();
        assertEquals(40, tjayBike.speed());
    }

    @Test
    public void accelerationTestForGear4() {
        AutomaticBike tjayBike = new AutomaticBike();
        assertEquals(56, tjayBike.speed());
    }

    @Test
    public void decelerationTest() {
        AutomaticBike tjayBike = new AutomaticBike();

        int speed =0;
        for (int i = 0; i < 20; i++) {
            tjayBike.accelerate(i);
            speed += tjayBike.speed();
        }

        assertEquals(20, speed);
        for (int i = 20; i >0 ; i--) {
            tjayBike.decelerate(i);
        }

        assertEquals(0, tjayBike.speed());
    }

    @Test
    public void decelerationTest2() {
        AutomaticBike tjayBike = new AutomaticBike();

        assertEquals(20, tjayBike.speed());

        assertEquals(31, tjayBike.speed());

        assertEquals(0, tjayBike.speed());
    }

}
