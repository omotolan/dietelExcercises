package Chapter14;

import java.util.Scanner;

public class Validation {
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String phoneNumber;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you firstName: ");
        String firstName = input.nextLine();
        System.out.println(validateFirstName(firstName));

    }
    public static boolean validateFirstName(String firstName){
        // means must start with capital letter
       return firstName.matches("[A-Z][a-zA-Z]*");
    }
    public static boolean validateLastName(String lastName){
return true;
    }
}
