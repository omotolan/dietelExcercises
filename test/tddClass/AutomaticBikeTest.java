package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {
    @Test
    public void startBikeTest(){
    //given
    AutomaticBike tjayBike = new AutomaticBike();
    //when
    tjayBike.powerBike(false);
    //assert
    assertEquals( true, tjayBike.isOn());
    }
    @Test
    public void offBikeTest(){
        //given
        AutomaticBike tjayBike = new AutomaticBike();
        tjayBike.powerBike(true);
        //given
        tjayBike.powerBike(false);
        //assert
        assertEquals( false, tjayBike.isOn());
    }

    @Test
    public void accelerationTest(){
        AutomaticBike tjayBike = new AutomaticBike();
        tjayBike.accelerate(1);
        tjayBike.accelerate(2);
        tjayBike.accelerate(3);
        tjayBike.accelerate(4);
        tjayBike.accelerate(5);
        tjayBike.accelerate(6);
        tjayBike.accelerate(7);
        tjayBike.accelerate(8);
        tjayBike.accelerate(9);
        tjayBike.accelerate(10);
        tjayBike.accelerate(11);
        tjayBike.accelerate(12);
        tjayBike.accelerate(13);
        tjayBike.accelerate(14);
        tjayBike.accelerate(15);
        tjayBike.accelerate(16);
        tjayBike.accelerate(17);
        tjayBike.accelerate(18);
        tjayBike.accelerate(19);
        assertEquals(20, tjayBike.speedChange());
    }
    @Test
    public void accelerationTestForGear2(){
        AutomaticBike tjayBike = new AutomaticBike();
        tjayBike.accelerate(1);
        tjayBike.accelerate(2);
        tjayBike.accelerate(3);
        tjayBike.accelerate(4);
        tjayBike.accelerate(5);
        tjayBike.accelerate(6);
        tjayBike.accelerate(7);
        tjayBike.accelerate(8);
        tjayBike.accelerate(9);
        tjayBike.accelerate(10);
        tjayBike.accelerate(11);
        tjayBike.accelerate(12);
        tjayBike.accelerate(13);
        tjayBike.accelerate(14);
        tjayBike.accelerate(15);
        tjayBike.accelerate(16);
        tjayBike.accelerate(17);
        tjayBike.accelerate(18);
        tjayBike.accelerate(19);
        tjayBike.accelerate(20);
        tjayBike.accelerate(21);
        tjayBike.accelerate(23);
        tjayBike.accelerate(25);
        tjayBike.accelerate(27);
        tjayBike.accelerate(29);


        assertEquals(31,tjayBike.speedChange());
        // assertEquals(31, tjayBike.accelerating());
    }
   @Test
    public void accelerationTestForGear3(){
        AutomaticBike tjayBike = new AutomaticBike();
        tjayBike.accelerate(1);
        tjayBike.accelerate(2);
        tjayBike.accelerate(3);
        tjayBike.accelerate(4);
        tjayBike.accelerate(5);
        tjayBike.accelerate(6);
        tjayBike.accelerate(7);
        tjayBike.accelerate(8);
        tjayBike.accelerate(9);
        tjayBike.accelerate(10);
        tjayBike.accelerate(11);
        tjayBike.accelerate(12);
        tjayBike.accelerate(13);
        tjayBike.accelerate(14);
        tjayBike.accelerate(15);
        tjayBike.accelerate(16);
        tjayBike.accelerate(17);
        tjayBike.accelerate(18);
        tjayBike.accelerate(19);
        tjayBike.accelerate(20);
        assertEquals(21, tjayBike.speedChange());
        tjayBike.accelerate(23);
        tjayBike.accelerate(25);
        tjayBike.accelerate(27);
        tjayBike.accelerate(29);
        assertEquals(31, tjayBike.speedChange());
        tjayBike.accelerate(34);
        tjayBike.accelerate(37);
        assertEquals(40, tjayBike.speedChange());
    }
    @Test
    public void accelerationTestForGear4(){
        AutomaticBike tjayBike = new AutomaticBike();
        tjayBike.accelerate(1);
        tjayBike.accelerate(2);
        tjayBike.accelerate(3);
        tjayBike.accelerate(4);
        tjayBike.accelerate(5);
        tjayBike.accelerate(6);
        tjayBike.accelerate(7);
        tjayBike.accelerate(8);
        tjayBike.accelerate(9);
        tjayBike.accelerate(10);
        tjayBike.accelerate(11);
        tjayBike.accelerate(12);
        tjayBike.accelerate(13);
        tjayBike.accelerate(14);
        tjayBike.accelerate(15);
        tjayBike.accelerate(16);
        tjayBike.accelerate(17);
        tjayBike.accelerate(18);
        tjayBike.accelerate(19);
        tjayBike.accelerate(20);
        assertEquals(21, tjayBike.speedChange());
        tjayBike.accelerate(23);
        tjayBike.accelerate(25);
        tjayBike.accelerate(27);
        tjayBike.accelerate(29);
        assertEquals(31, tjayBike.speedChange());

        tjayBike.accelerate(34);
        tjayBike.accelerate(37);
        assertEquals(40, tjayBike.speedChange());
        tjayBike.accelerate(44);
        tjayBike.accelerate(48);
        tjayBike.accelerate(52);
        assertEquals(56, tjayBike.speedChange());
    }
    @Test
    public void decelerationTest() {
        AutomaticBike tjayBike = new AutomaticBike();
        tjayBike.accelerate(1);
        tjayBike.accelerate(2);
        tjayBike.accelerate(3);
        tjayBike.accelerate(4);
        tjayBike.accelerate(5);
        tjayBike.accelerate(6);
        tjayBike.accelerate(7);
        tjayBike.accelerate(8);
        tjayBike.accelerate(9);
        tjayBike.accelerate(10);
        tjayBike.accelerate(11);
        tjayBike.accelerate(12);
        tjayBike.accelerate(13);
        tjayBike.accelerate(14);
        tjayBike.accelerate(15);
        tjayBike.accelerate(16);
        tjayBike.accelerate(17);
        tjayBike.accelerate(18);
        tjayBike.accelerate(19);
        assertEquals(20, tjayBike.speedChange());
        tjayBike.decelerate(19);
        tjayBike.decelerate(18);
        tjayBike.decelerate(17);
        tjayBike.decelerate(16);
        tjayBike.decelerate(15);
        tjayBike.decelerate(14);
        tjayBike.decelerate(13);
        tjayBike.decelerate(12);
        tjayBike.decelerate(11);
        tjayBike.decelerate(10);
        tjayBike.decelerate(9);
        tjayBike.decelerate(8);
        tjayBike.decelerate(7);
        tjayBike.decelerate(6);
        tjayBike.decelerate(5);
        tjayBike.decelerate(4);
        tjayBike.decelerate(3);
        tjayBike.decelerate(2);
        tjayBike.decelerate(1);
        assertEquals(0, tjayBike.speedChange());
    }
    @Test
    public void decelerationTest2() {
        AutomaticBike tjayBike = new AutomaticBike();
        tjayBike.accelerate(1);
        tjayBike.accelerate(2);
        tjayBike.accelerate(3);
        tjayBike.accelerate(4);
        tjayBike.accelerate(5);
        tjayBike.accelerate(6);
        tjayBike.accelerate(7);
        tjayBike.accelerate(8);
        tjayBike.accelerate(9);
        tjayBike.accelerate(10);
        tjayBike.accelerate(11);
        tjayBike.accelerate(12);
        tjayBike.accelerate(13);
        tjayBike.accelerate(14);
        tjayBike.accelerate(15);
        tjayBike.accelerate(16);
        tjayBike.accelerate(17);
        tjayBike.accelerate(18);
        tjayBike.accelerate(19);
        assertEquals(20, tjayBike.speedChange());
        tjayBike.accelerate(21);
        tjayBike.accelerate(23);
        tjayBike.accelerate(25);
        tjayBike.accelerate(27);
        tjayBike.accelerate(29);
        assertEquals(31,tjayBike.speedChange());
        tjayBike.decelerate(29);
        tjayBike.decelerate(27);
        tjayBike.decelerate(25);
        tjayBike.decelerate(23);
        tjayBike.decelerate(21);
        tjayBike.decelerate(20);
        tjayBike.decelerate(19);
        tjayBike.decelerate(18);
        tjayBike.decelerate(17);
        tjayBike.decelerate(16);
        tjayBike.decelerate(15);
        tjayBike.decelerate(14);
        tjayBike.decelerate(13);
        tjayBike.decelerate(12);
        tjayBike.decelerate(11);
        tjayBike.decelerate(10);
        tjayBike.decelerate(9);
        tjayBike.decelerate(8);
        tjayBike.decelerate(7);
        tjayBike.decelerate(6);
        tjayBike.decelerate(5);
        tjayBike.decelerate(4);
        tjayBike.decelerate(3);
        tjayBike.decelerate(2);
        tjayBike.decelerate(1);
        assertEquals(0, tjayBike.speedChange());
    }

    }
