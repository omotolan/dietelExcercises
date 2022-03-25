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
        hisense.setTemperature(16);
        sikiru.setName("Sikiru");
        Native.setAge(24);
        Native.getAge(16);
        //assert
        assertEquals(16, hisense.getTemperature());
        assertEquals("Sikiru", sikiru.getName());
        assertEquals(16, sikiru.getAge(16));


    }
}
