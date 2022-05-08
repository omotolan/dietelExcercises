package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        String word = "";

        for (int i = 0; !word.equals("stop"); i++) {
            System.out.println("Enter stop: ");
            word = input.next();
            if (word.equals("stop"))
                continue;
            words.add(word);
        }
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

    }
}
