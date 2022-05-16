package Chapter7;

import java.util.Scanner;

public class MobilePhoneDriver {
    static MobilePhone mobilePhone = new MobilePhone("823192");
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        while (!quit){
            instructions();
            System.out.println("Enter selection: ");
            int selection = input.nextInt();

            switch (selection){
                case 1: addContacts();
                break;
                case 2: findContact();
                break;
                case 3: updateContact();
                break;
                case 4: removeContact();
                break;
                case 5: quit = true;
            }
        }


    }

    private static void instructions(){
        String options = """
                1. Create contact
                2. find contact
                3. update contact
                4. remove contact
                5.to quit
                """;
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
        String name = input.next();
        mobilePhone.findContact(name);
        numberOfContacts();
    }

    private static void addContacts() {
        System.out.println("Enter name: ");
        String name = input.next();
        System.out.println("Enter number: ");
        String number = input.next();
        mobilePhone.createContact(name, number);
       // Contacts myContacts = new Contacts(name, number);
        numberOfContacts();

       // mobilePhone.addNewContact(myContacts);
    }
    private static void numberOfContacts(){
        System.out.println(mobilePhone.numberOfContacts()+ "contacts");
    }
}
