package Classwork;

public class Native {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.name = "thermocool";
        airConditioner.temp = 16;

        airConditioner.temperatureIncrease(16);
        System.out.println(airConditioner.temp);

    }
}


