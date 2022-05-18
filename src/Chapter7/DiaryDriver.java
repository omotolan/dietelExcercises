package Chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaryDriver {
    static Scanner input = new Scanner(System.in);
    private static final Diary diary = new Diary("", "");


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
        diary.lock();
        System.out.println("Enter password: ");
        String password = input.nextLine();
        diary.unLock(password);
        if (diary.isLock()) {
            System.out.println("password incorrect");
            login();

        } else {
            homePage();
        }
    }

    private static void instructions() {
        System.out.println("""
                                
                select:
                1. Create Entry
                2. to find entry
                3. remove entry
                4. clear all entry
                5. change password
                6. Lock diary
                7. quit application
                                
                """);
    }

    private static void homePage() {
        String decor = "-";
        boolean quit = false;
        int selection = 0;
        System.out.println(decor.repeat(20) + " Diary " + decor.repeat(20));

        while (!quit) {
            instructions();
            numberOfEntries();
            System.out.println("Enter selection: ");
            try {

                selection = input.nextInt();
                input.nextLine();
            }
            catch (InputMismatchException exception){
                System.out.println("enter an integer!!!");
                System.exit(6);
            }
            switch (selection) {
                case 1 -> createEntry();
                case 2 -> findEntry();
                case 3 -> deleteEntry();
                case 4 -> clearAllEntries();
                case 5 -> changePassword();
                case 6 -> lockDiary();
                case 7 -> {
                    quit = true;
                    System.out.println(decor.repeat(20) + " Goodbye!!! " + decor.repeat(20));
                }
                default -> {
                    System.out.println("Selection Invalid.");
                    homePage();
                }
            }
        }
    }

    private static void createEntry() {
        System.out.println("Enter title: ");
        String title = input.nextLine();
        System.out.println("Enter body: ");
        String body = input.nextLine();
        diary.createEntry(title, body);

    }

    private static void findEntry() {
        System.out.println("Enter title of entry: ");
        String titleOfEntry = input.nextLine();
        diary.findEntry(titleOfEntry);
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

    private static void clearAllEntries() {
        System.out.println("Enter password: ");
        String password = input.nextLine();
        diary.deleteAllEntry(password);
        System.out.println("All entries have been deleted.");
    }

    private static void changePassword() {
        System.out.println("Enter old password: ");
        String oldPassword = input.nextLine();
        System.out.println("Enter new password: ");
        String newPassword = input.nextLine();
        diary.updatePassword(oldPassword, newPassword);
    }

    private static void lockDiary() {
        diary.lock();
        if (diary.isLock()) {
            System.out.println("Enter password: ");
            String password = input.nextLine();
            diary.unLock(password);
            if (diary.isLock()) {
                System.out.println("incorrect password!!!");
                lockDiary();

            } else {
                homePage();

            }
        }
    }

    private static void numberOfEntries() {
        System.out.println(diary.getNoOfEntry() + " entries");
    }

}
