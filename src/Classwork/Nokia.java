package Classwork;

import java.util.Scanner;

public class Nokia {
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
         if(numberSelected==1) {
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
                if (numberSelected > 0 && numberSelected <= 10) {
                    switch (numberSelected) {
                        case 1 -> System.out.println("1. Search");
                        case 2 -> System.out.println("2. Service Nos.");
                        case 3 -> System.out.println("3. Add name");
                        case 4 -> System.out.println("4. Erase");
                        case 5 -> System.out.println("5. Edit");
                        case 6 -> System.out.println("6. Assign tone");
                        case 7 -> System.out.println("7. Send b'card");
                        case 8 -> {
                            System.out.println("""
                                    1. Type of view
                                    2. Memory status
                                    """);
                            System.out.println(" ");
                            numberSelected = keyboard.nextInt();
                            switch (numberSelected) {
                                case 1:
                                    System.out.println(" ");
                                case 2:
                                    System.out.println(" ");
                            }
                        }
                        case 9 -> System.out.println("9. Speed dials");
                        case 10 -> System.out.println("10. Voice tags");
                    }
                }
            }
        if(numberSelected==2){
            System.out.println("""
                    1. Write messages
                    2. Inbox
                    3. Outbox
                    4. Picture messages
                    5. Templates
                    6. Smileys
                    7. Message settings
                    8. Infor services
                    9. Voice mailbox number
                    10. Service command editor
                    """);
            System.out.println(" ");
            numberSelected = keyboard.nextInt();
            if(numberSelected==7){
                System.out.println("""
                        1. Set 1
                        2. Common
                        """);
            }
            System.out.println(" ");
            numberSelected = keyboard.nextInt();
            switch (numberSelected){
                case 1 :
                    System.out.println("""
                            1. Message centre number
                            2. Message sent as
                            3. Message validity
                            """);
                    System.out.println(" ");
                    numberSelected= keyboard.nextInt();
                    switch (numberSelected) {
                        case 1 -> System.out.println(" ");
                        case 2 -> System.out.println(" ");
                        case 3 -> System.out.println(" ");
                    }
                case 2 :
                    System.out.println("""
                            1. Delivery reports
                            2. Reply via same centre
                            3. Character support
                            """);
                    System.out.println(" ");
                    numberSelected = keyboard.nextInt();
                    switch (numberSelected) {
                        case 1 -> System.out.println(" ");
                        case 2 -> System.out.println(" ");
                        case 3 -> System.out.println(" ");
                    }
            }
        }
        if(numberSelected==3){
            System.out.println("3. Chat");
        }
        if(numberSelected==4){
            System.out.println("""
                    1. Missed calls
                    2. Received calls
                    3. Dialled numbers
                    4. Erase recent call lists
                    5. Show call duration
                    6. Show call costs
                    7. Call cost settings
                    8. Prepaid credit
                    """);
            System.out.println(" ");
            numberSelected = keyboard.nextInt();
            if(numberSelected==5){
                System.out.println("""
                        1. Last call duration
                        2. All calls' duration
                        3. Received calls' duration
                        4. Dialled calls' duration
                        5. Clear timers
                        """);
                         System.out.println(" ");
                         numberSelected = keyboard.nextInt();
                switch (numberSelected) {
                    case 1 -> System.out.println(" ");
                    case 2 -> System.out.println(" ");
                    case 3 -> System.out.println(" ");
                    case 4 -> System.out.println(" ");
                    case 5 -> System.out.println(" ");
                }

            }
        }
    }
}
