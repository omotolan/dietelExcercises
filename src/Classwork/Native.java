package Classwork;

public class Native {
    public static AirConditioner airConditioner;
    private static String name;
    private static int age;

    public static void setTemp(int temp){
       airConditioner= new AirConditioner();

    }
    public static int setAge(int age){
        return age;
    }

    public static  String setName(String name) {
        return name;
    }
}


