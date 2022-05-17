package Chapter7;

import java.util.Scanner;

public class DiaryDriver {
    static Scanner input = new Scanner(System.in);
    private static Diary diary = new Diary("", "");

    public static void main(String[] args) {
        createDiaryAccount();
        login();

    }

    private static void createDiaryAccount() {
        System.out.println("SIGN UP PAGE");
        System.out.println("Enter Username: ");
        String userName = input.nextLine();
        System.out.println("Create password: ");
        String password = input.nextLine();
        diary.setName(userName);
        diary.setPassword(password);
    }

    private static void login() {
        System.out.println("welcome back " + diary.getName());
        System.out.println("Enter password: ");
        String password = input.nextLine();
        if (diary.isLock(password)) {
            begin();
        } else {
            System.out.println("password incorrect");
            login();
        }
    }

    private static void begin() {
        String decor = "-";
        boolean quit = false;

        System.out.println(decor.repeat(20) + " Diary " + decor.repeat(20));

        while (!quit) {
            instructions();
            numberOfEntries();
            System.out.println("Enter selection: ");
            int selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 1 -> createEntry();
                case 2 -> findEntry();
                case 3 -> deleteEntry();
                case 4 -> clearAllEntries();
                case 5 -> changePassword();
                case 6 -> {
                    quit = true;
                    System.out.println(decor.repeat(20) + " Goodbye!!! " + decor.repeat(20));
                }
                default -> {
                    System.out.println("Selection Invalid.");
                    begin();
                }
            }
        }
    }

    private static void findEntry() {
        System.out.println("Enter title of entry: ");
        String titleOfEntry = input.nextLine();
        diary.findEntry(titleOfEntry);
    }

    private static void clearAllEntries() {
        System.out.println("Enter password: ");
        String password = input.nextLine();
        diary.deleteAllEntry(password);
        System.out.println("All entries have been deleted.");
    }

    public static void instructions() {
        System.out.println("""
                                
                select:
                1. Create Entry
                2. to find entry 
                3. remove entry
                4. clear all entry
                5. change password
                6. quit application
                                
                """);
    }

    public static void createEntry() {
        System.out.println("Enter title: ");
        String title = input.nextLine();
        System.out.println("Enter body: ");
        String body = input.nextLine();
        diary.createEntry(title, body);

    }

    private static void deleteEntry() {
        System.out.println("Enter title of entry: ");
        String entryTitle = input.nextLine();
        System.out.println("Are you sure you want to delete entry" + entryTitle + "? input 'yes' to proceed and 'no' to cancel");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            diary.deleteEntry(entryTitle);
            System.out.println("Entry " + entryTitle + " has been deleted.");
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Action cancelled and entry not deleted.");
        }

    }

    private static void numberOfEntries() {
        System.out.println(diary.getNoOfEntry() + " entries");
    }

    private static void changePassword() {
        System.out.println("Enter old password: ");
        String oldPassword = input.nextLine();
        System.out.println("Enter new password: ");
        String newPassword = input.nextLine();
        diary.updatePassword(oldPassword, newPassword);
    }
}
