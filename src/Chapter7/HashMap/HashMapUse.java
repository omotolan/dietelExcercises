package Chapter7.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapUse {
    public static void main(String[] args) {
        // ignores duplicate values
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> nativeDetails = new HashMap<>();

        nativeDetails.put("tola", 30);
        nativeDetails.put("bassey", 12);
        nativeDetails.put("stephen", 17);
        nativeDetails.put("deji", 19);

        System.out.println(nativeDetails.size());
        ;
        System.out.println(nativeDetails.get("tola"));
        nativeDetails.replace("tola",30,19);


        for (String i : nativeDetails.keySet()){
            System.out.println("name: " + i + " age: " + nativeDetails.get(i));
        }

        HashMap<String, String> stateAndCapital = new HashMap<>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter state: ");
            String state = input.nextLine();
            System.out.println("Enter capital: ");
            String capital = input.nextLine();
            stateAndCapital.put(state, capital);
        }
        for (String i : stateAndCapital.keySet()){
            System.out.println("states: " + i + "," + "capital: " + stateAndCapital.get(i));
        }
    }
}
