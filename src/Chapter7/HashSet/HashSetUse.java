package Chapter7.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetUse {
    // ignores duplicated values
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String > cars = new HashSet<>();

        cars.add("volvo");
        cars.add("benz");
        cars.add("benz");
        cars.add("camry");

        System.out.println(cars.size());
        HashSet<String > motors = new HashSet<>(5);
        for (int i = 0; i < 6; i++) {
            System.out.println("enter cars: ");
            String car = input.nextLine();
            motors.add(car);
            
        }
        for (String i : motors){
            System.out.println(i);
        }

    }
}
