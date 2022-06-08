package Chapter6;

import java.util.Scanner;

public class BeautifyingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word or sentence: ");
        String words = input.nextLine();
        input.close();


        System.out.println("you entered: " + words);

        words = beautify(words);

        System.out.println("punctuated sentence / word: " + words);


    }

    public static String addFullStop(String data) {
        int dataLength = data.length();
        if (data.charAt(dataLength - 1) != '.') {
            data = data + '.';
        }/*        if (!data.endsWith(".")) {
            data = data + ".";
           return data;
        }*/
        return data;
    }


    public static String capitaliseFirstWord(String data) {
        char firstLetter = data.charAt(0);
        char capitalisedFirstLetter = data.toUpperCase().charAt(0);
        if (data.charAt(0) != capitalisedFirstLetter) {
            String stringOfFirstLetter = String.valueOf(firstLetter);
            String stringOfCapitalisedLetter = String.valueOf(capitalisedFirstLetter);
            data = data.replaceFirst(stringOfFirstLetter, stringOfCapitalisedLetter);
            return data;
        }
        return data;

    }

    public static String beautify(String data) {
        data = capitaliseFirstWord(data);
        data = addFullStop(data);

        return data;
    }

}
