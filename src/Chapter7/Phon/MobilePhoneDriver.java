package Chapter7.Phon;

import java.util.Scanner;

public class MobilePhoneDriver {
    static MobilePhone mobilePhone = new MobilePhone("823192");
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            instructions();
            System.out.println("Enter selection: ");
            int selection = input.nextInt();
            input.nextLine();

            switch (selection) {
                case 1 -> addContacts();
                case 2 -> findContact();
                case 3 -> updateContact();
                case 4 -> removeContact();
                case 5 -> quit = true;
                default -> System.out.println("Wrong selection.");
            }
        }


    }

    private static void instructions() {
        String options = ("""
                1. Create contact
                2. find contact
                3. update contact
                4. remove contact
                5.to quit
                """);
        System.out.println(options);
    }

    private static void removeContact() {
        numberOfContacts();
    }

    private static void updateContact() {
        numberOfContacts();
    }

    private static void findContact() {
        System.out.println("Enter contact name: ");
        String name = input.nextLine();
        mobilePhone.findContact(name);
        numberOfContacts();
    }

    private static void addContacts() {
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter number: ");
        String number = input.nextLine();
        mobilePhone.createContact(name, number);
        numberOfContacts();
    }

    private static void numberOfContacts() {
        System.out.println(mobilePhone.numberOfContacts() + "contacts");
    }
}
