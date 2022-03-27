package tddClass;

import Classwork.AirConditioner;
import Classwork.Native;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NativeTest {
//    @Test
//    public void NativeACtest(){
//        //when
//        Native sikiru = new Native ();
//        AirConditioner hisense = new AirConditioner();
//        //given
//        AirConditioner.setTemperature(16);
//        Native.setName("Sikiru");
//        Native.setAge(24);
//        sikiru.airConditioner().setTemperature(12);
//        //assert
//        assertEquals(16, hisense.getTemperature());
//        //assertEquals("Sikiru");
//       // assertEquals(16, sikiru.airConditioner().setTemp);
//
//
//    }
    @Test
    public void NativeACtest(){
        //given
        Native sikiru = new Native();
        AirConditioner airAC = new AirConditioner();
        Native tola = new Native();

        //when
        sikiru.airConditioner.setTemperature(12);
       // Native.airConditioner = airAC;
        Native.setAirConditioner(airAC);
        tola.airConditioner.setTemperature(12);
        sikiru.setName("biola");
        sikiru.setAge(13);
       sikiru.airConditioner.setTemperature(12);
       assertEquals(12, tola.airConditioner.getTemperature());


        //
        assertEquals(13, sikiru.getAge());
        assertEquals("biola", sikiru.getName());
    }

}
