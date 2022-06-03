package Chapter14;

import java.util.Scanner;

public class Tokenizing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }

    }
}
