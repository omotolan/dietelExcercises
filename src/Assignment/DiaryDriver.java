package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class DiaryDriver {
     static Scanner input = new Scanner(System.in);
    private static Diary diary = new Diary("tolani", "1234");
    private static ArrayList<Entry> entries;
    public static void main(String[] args) {

    boolean quit = false;
    while (!quit){
        instructions();
        int selection = input.nextInt();
        switch (selection){
            case 1: createEntry();
            break;
            case 2 :numberOfEntries();
                break;
            case 3:
                break;
            case 4: quit = true;


        }
    }


    }

    private static void numberOfEntries() {
        int numberOfEntries = diary.getNoOfEntry();
        System.out.println("you have " + numberOfEntries + " entries in your diary");
    }

    public static void instructions(){
        System.out.println("""
                Diary
                select:
                1. Create Entry
                2. get number of entries
                3. remove entry
                4. clear all entry
                5. quit application
                
                """);
    }
    public static void createEntry(){
        System.out.println("Enter title: ");
        String title = input.next();
        System.out.println("Enter date: ");
        String date = input.next();
        System.out.println("Enter body: ");
        String body = input.next();
        diary.createEntry(title, date, body);

    }
}
