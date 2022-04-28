package Classwork;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                List of menu functions,
                Enter:
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);
        System.out.println("ENTER NUMBER: ");
        int numberSelected = keyboard.nextInt();

        if (numberSelected == 1) {
            System.out.println("""
                    1. Search
                    2. Service Nos.
                    3. Add name
                    4. Erase
                    5. Edit
                    6. Assign tone
                    7. Send b'card
                    8. options
                    9. Speed dials
                    10. Voice tags
                    """);
            System.out.println(" ");
            numberSelected = keyboard.nextInt();
            switch (numberSelected) {

                case 8:
                    System.out.println("""
                            1. Type of view
                            2. Memory status""");
                    break;
            }
        }
        if (numberSelected == 2) {
            System.out.println("""
                    1. Write Messages
                    2. Inbox
                    3. Outbox
                    4. Picture messages
                    5. Templates
                    6. Smileys
                    7. Message settings
                    8. Info services
                    9. Voice mailbox number
                    10. Service command editor
                    """);
            System.out.println(" ");
            numberSelected = keyboard.nextInt();
            switch (numberSelected) {
                case 7:
                    System.out.println("""
                            1. Set 1
                            2. Common
                            """);
                    System.out.println(" ");
                    numberSelected = keyboard.nextInt();
                    if (numberSelected == 1) {
                        System.out.println("""
                                1. Message centre number
                                2. Message sent as
                                3. Message validity
                                """);
                    }
                    if (numberSelected == 2) {
                        System.out.println("""
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                                """);
                    }
            }
        }


    }
}

