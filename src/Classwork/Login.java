package Classwork;

import java.util.Scanner;

public class Login {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                Hello My People,
                Enter:
                1 -> Login
                2 -> register
                3 -> logout
                """);
        int userInput = keyboard.nextInt();

        switch (userInput) {
            case 1: {
                System.out.println("Enter your name");
                String name = keyboard.next();
                System.out.println("Enter your password");
                String password = keyboard.next();
                System.out.println("\n".repeat(50));
                switch (password) {
                    case "ojo":
                        System.out.println("correct");
                        break;
                }
            }
        }

    }
}
