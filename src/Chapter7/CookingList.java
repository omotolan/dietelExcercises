package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class CookingList {
    Scanner input = new Scanner(System.in);
    private ArrayList<String> myList = new ArrayList<>();

    public void instruction() {
        System.out.println("""
                Welcome to NotePad
                choose from the following options:
                                
                1. To add item to list
                2. To remove item from the list
                3. To modify the list
                4. To search item in list
                5. To print out the list
                6. To quit the application
                            
                """);
        System.out.println();
    }

    public void printList() {
        System.out.println("you have " + myList.size() + " item(s) in your list.");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("item " + (i + 1) + ". " + myList.get(i));
        }
    }

    public void addItem() {
        System.out.println("add item: ");
        myList.add(input.next());
    }

    public void getItem() {
        System.out.println("Enter item position: ");
        myList.get(input.nextInt());
    }

    public void modifyList() {
        System.out.println("Enter item position: ");
        int itemPosition = input.nextInt();
        input.nextLine();
        System.out.println("Enter item to replace: ");
        String newItem = input.next();
        myList.set(itemPosition, newItem);
        System.out.println("Item at position " + (itemPosition + 1) + " on the list has been changed to " + newItem);
    }

    public void searchList() {
        // boolean itemExists = myList.contains(item);
        System.out.println("Enter item to search: ");
        String itemSearch = input.next();
        int position = myList.indexOf(itemSearch);
        if (position >= 0) {
            System.out.println("item found and position of item is: " + (position + 1));
        } else {
            System.out.println("item does not exist.");
        }
//        for (int i = 0; i < myList.size(); i++) {
//            String searchedItem = myList.get(i);
//            if (searchedItem == item){
//                System.out.println(item);
//            }
//            else {
//                System.out.println("item not found");
//            }
//        }
    }

    public void removeItem() {
        System.out.println("Enter item position: ");
        int itemPosition = input.nextInt();
        myList.remove(itemPosition);
    }
}
