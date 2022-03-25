package tddClass;

import Classwork.AirConditioner;
import Classwork.Native;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NativeTest {
    @Test
    public void NativeACtest(){
        //when
        Native sikiru = new Native ();
        AirConditioner hisense = new AirConditioner();
        //given
        AirConditioner.setTemperature(16);
        Native.setName("Sikiru");
        Native.setAge(24);
        //assert
        assertEquals(16, hisense.getTemperature());
        //assertEquals("Sikiru");
       // assertEquals(16, sikiru.airConditioner().setTemp);


    }
}
