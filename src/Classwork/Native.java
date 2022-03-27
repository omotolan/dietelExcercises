package Classwork;

public class Native {
    public static AirConditioner airConditioner;
    private int age;
    private String name;

public static void setAirConditioner(AirConditioner air) {

    Native.airConditioner = air;
}


    //    public static void setAirConditioner(int temperature){
//        airConditioner.setTemperature(temperature);
//    }

    public void setName(String name){
       this.name = name;
    }
   public String getName(){
        return name;
   }
   public void setAge(int age){
        this.age = age;
   }
   public int getAge(){
        return age;
   }


    public static void main(String[] args) {
            Native nuru = new Native();
            AirConditioner ourAir = new AirConditioner();
            Native.airConditioner = ourAir;
airConditioner.setTemperature(12);

    }
}


