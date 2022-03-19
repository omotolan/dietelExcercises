package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void palindromeTest() {
        //given
        Kata user1 = new Kata();
        //when
        boolean result = user1.palindrome(12321);
        //assert
        assertTrue(result);
        //when
        result = user1.palindrome(12342);
        //assert
        assertFalse(result);
    }

    @Test
    public void TelevisionOnTest() {
        //given
        Kata television = new Kata();
        assertFalse(television.isOn());
        //when
        television.tvSwitch();
        //assert
        assertTrue(television.isOn());
    }

    @Test
    public void TelevisionOffTest() {
        //given
        Kata television = new Kata();
        television.tvSwitch();
        assertTrue(television.isOn());
        //when
        // television.tvSwitch(); comment line 37 and 38 out and this would work other way round
        television.tvSwitch();
        //assert
        assertFalse(television.isOn());
    }

    @Test
    public void TelevisionName() {
        //given
        Kata television = new Kata();
        television.tvSwitch();
        assertTrue(television.isOn());
        //when
        television.tvName("panasonic");
        //
        assertEquals("panasonic", television.getTVName());
    }

    @Test
    public void VolumeIncreaseTest() {
        //given
        Kata television = new Kata();
        television.tvSwitch();
        assertTrue(television.isOn());
        assertEquals(0, television.changingVolume());
        //when
        television.volumeIncrease();
        television.volumeIncrease();
        television.volumeIncrease();
        television.volumeIncrease();
        //assert
        assertEquals(4, television.changingVolume());
    }

    @Test
    public void VolumeDecreaseTest() {
        //given
        Kata television = new Kata();
        television.tvSwitch();
        assertTrue(television.isOn());
        television.volumeIncrease();
        television.volumeIncrease();
        assertEquals(2, television.changingVolume());
        //when
        television.volumeDecrease();
        //assert
        assertEquals(1, television.changingVolume());

    }

    @Test
    public void MuteTest() {
        //given
        Kata television = new Kata();
        television.tvSwitch();
        assertTrue(television.isOn());
        television.volumeIncrease();
        television.volumeIncrease();
        television.volumeIncrease();
        television.volumeIncrease();
        assertEquals(4, television.changingVolume());
        //when
        television.checkMute();
        //assert
        assertEquals(0, television.changingVolume());
    }

    @Test
    public void UnMuteTest() {
        //given
        Kata television = new Kata();
        television.tvSwitch();
        assertTrue(television.isOn());
        television.volumeIncrease();
        television.volumeIncrease();
        television.volumeIncrease();
        television.volumeIncrease();
        assertEquals(4, television.changingVolume());
        //when
        television.checkMute(); // i mute
        television.checkMute();
        //assert
        assertEquals(4, television.changingVolume());
    }

    @Test
    public void TestDrillerFor1to4Copies() {
        Kata testdrill = new Kata();
        int cost = testdrill.testDriller(3);
        assertEquals(6000, cost);
    }

    @Test
    public void TestDrillerFor5to9Copies() {
        Kata testdrill = new Kata();
        int cost = testdrill.testDriller(6);
        assertEquals(10800, cost);
    }

    @Test
    public void TestDrillerFor10to29Copies() {
        Kata testdrill = new Kata();
        int cost = testdrill.testDriller(10);
        assertEquals(16000, cost);
    }

    @Test
    public void TestDrillerFor30to49Copies() {
        Kata testdrill = new Kata();
        int cost = testdrill.testDriller(45);
        assertEquals(67500, cost);
    }

    @Test
    public void TestDrillerFor50to99Copies() {
        Kata testdrill = new Kata();
        int cost = testdrill.testDriller(77);
        assertEquals(100100, cost);
    }

    @Test
    public void TestDrillerFor100to199Copies() {
        Kata testdrill = new Kata();
        int cost = testdrill.testDriller(188);
        assertEquals(225600, cost);
    }

    @Test
    public void TestDrillerFor200to499Copies() {
        Kata testdrill = new Kata();
        int cost = testdrill.testDriller(356);
        assertEquals(391600, cost);
    }

    @Test
    public void TestDrillerForAbove499Copies() {
        Kata testdrill = new Kata();
        int cost = testdrill.testDriller(677);
        assertEquals(677000, cost);
    }

    @Test
    public void QuotientTest() {
        //given
        Kata math = new Kata();
        //when
        int answer = math.quotient(3, 9);
        //assert
        assertEquals(3, answer);

    }

    /* @Test
     public void add() {
         int number = 2;
        // number = number + 2;
         while (number <= 10) {
             System.out.print(number+ "");
             number = number + 2;
         }

     }*/
    @Test
    public void add() {
        int number = 1;
        // number = number + 2;
        while (number <= 10) {
            if (number % 2 == 0) {
                System.out.print(number + "");

            }
            number = number + 1;
        }

    }

    /* @Test
     public void unmute(){
         tv.power();
         int number =1;
         while (number<9){
             tv.increasevolume();
             number = number +2;
         }
     }*/
    @Test
    public void checkIfOddOrEvenTest() {
        //given
        Kata checkNumber = new Kata();
        //when
        boolean result = checkNumber.enterInteger(5);
        //assert
        assertEquals(false, result);

    }

    @Test
    public void biggestNumberTest() {
        //given
        Kata bigNumber = new Kata();
        //when
        int result = bigNumber.biggestNumber(3, 4, 5, 7, 9);
        //assert
        assertEquals(9, result);
    }

    @Test
    public void highestNumberTest() {
        //given
        Kata highestNumber = new Kata();
        //when
        int result = highestNumber.highestNumber(6, 9, 45, 67, 35);
        //assert
        assertEquals(67, result);
    }

    @Test
    public void factorTest() {
        //given
        Kata factor = new Kata();
        //when
        int result = factor.factor(24);
        //assert
        assertEquals(8, result);
    }
    @Test
    public void primeTest(){
        //given
        Kata prime = new Kata();
        //when
        boolean result = prime.prime(11);
        //assert
       // assertEquals(2,result);
        assertTrue(result);
    }
}