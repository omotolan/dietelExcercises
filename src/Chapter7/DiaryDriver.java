package Chapter7;

import Assignment.Entry;
import Chapter7.Diary;

import java.util.ArrayList;
import java.util.Scanner;

public class DiaryDriver {
    static Scanner input = new Scanner(System.in);
    private static Diary diary = new Diary("tolani", "1234");
    private static ArrayList<Entry> entries;

    public static void main(String[] args) {
        String decor = "-";
        boolean quit = false;

        System.out.println(decor.repeat(20) + " Diary " + decor.repeat(20));
        while (!quit) {
            instructions();
            System.out.println("Enter selection: ");
            int selection = input.nextInt();
            switch (selection) {
                case 1 -> createEntry();
                case 2 -> numberOfEntries();
                case 3 -> deleteEntry();
                case 4 -> clearAllEntries();
                case 5 -> {
                    quit = true;
                    System.out.println(decor.repeat(20) + " Goodbye!!! " + decor.repeat(20));
                }
            }
        }


    }

    private static void clearAllEntries() {
        System.out.println("Enter password: ");
        String password = input.next();
        diary.deleteAllEntry(password);
    }

    public static void instructions() {
        System.out.println("""
                                
                select:
                1. Create Entry
                2. get number of entries
                3. remove entry
                4. clear all entry
                5. quit application
                                
                """);
    }

    public static void createEntry() {
        System.out.println("Enter title: ");
        String title = input.next();
        System.out.println("Enter date: ");
        String date = input.next();
        System.out.println("Enter body: ");
        String body = input.next();
        diary.createEntry(title, date, body);

    }

    private static void deleteEntry() {
        System.out.println("Enter title of entry: ");
        String entryTitle = input.next();
        System.out.println("Are you sure you want to delete entry" + entryTitle + "? input 'yes' to proceed and 'no' to cancel");
        String answer = input.next();
        if (answer.equals("yes")) {
            diary.deleteEntry(entryTitle);
            System.out.println("Entry " + entryTitle + " has been deleted.");
        } else if (answer.equals("no")) {
            System.out.println("Action cancelled and entry not deleted.");
        }

    }

    private static void numberOfEntries() {
        int numberOfEntries = diary.getNoOfEntry();
        System.out.println("you have " + numberOfEntries + " entries in your diary");
    }
}
