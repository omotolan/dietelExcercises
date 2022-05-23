package FreeStyle;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {

String word = "google";

        int counter = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.toLowerCase().charAt(i) == 'g') {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
