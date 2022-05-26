package FreeStyle;

import java.util.ArrayList;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("a");
        cars.add("1");
        cars.add("2");
        cars.add("4");
        System.out.println(Arrays.toString(cars.toArray()));
        cars.remove(2);
        System.out.println(Arrays.toString(cars.toArray()));
    }
}
