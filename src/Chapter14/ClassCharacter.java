package Chapter14;

import java.util.Scanner;

public class ClassCharacter {
    static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
        String word = collectInput();
        validatePassword(collectInput());
    }
    public static String collectInput(){
        System.out.println("Enter password (Password must contain a digit and Uppercase: ): ");
        return input.nextLine();
    }
    public static void validatePassword(String word) {
      //  for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(0);
         //   System.out.println(c);
            if (!Character.isDigit(c)) {

                validatePassword(collectInput());
            } else {
                System.out.println("true");
            }

       // }
    }
}
