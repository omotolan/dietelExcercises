package DSA;

import java.util.HashMap;

public class Hassh {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("2", "tola");
        names.put("1", "tola");
        names.put("4", "ola");
        names.put("5", "omo");
        names.put("1", "garri");
        System.out.println(names.get("1"));
        System.out.println(names.size());
    }
}
