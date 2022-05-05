package Chapter7;

import java.util.Scanner;

public class CookingListDriver {
    private static Scanner input = new Scanner(System.in);
    private static CookingList cookingList = new CookingList();

    public static void main(String[] args) {
        boolean quit = false;

        System.out.println("Welcome to NotePad");
        while (!quit) {
            instruction();
            int option = input.nextInt();
            switch (option) {
                case 1 -> addItem();
                case 2 -> removeItem();
                case 3 -> replaceItemOnList();
                case 4 -> searchItemOnList();
                case 5 -> printList();
                case 6 -> getListSize();
                case 7 -> clearList();
                case 8 -> {
                    quit = true;
                    System.out.println("Thank you!!!");
                }
            }
        }
    }

    private static void getListSize() {
        System.out.println("You have " + cookingList.listSize() + " items in your list");
    }

    private static void clearList() {
        cookingList.clearList();
        System.out.println("List is empty.");
    }

    private static void instruction() {
        System.out.println("""
                       
                choose from the following options:
                                
                1. To add item to list
                2. To remove item from the list
                3. To modify the list
                4. To search item in list
                5. To print out the list
                6. To get number of items in list
                7. To clear list
                8. To quit the application
                            
                """);
        System.out.println();
    }

    private static void addItem() {
        System.out.println("add item: ");
        String item = input.next();
        cookingList.addItemToList(item);

    }

    private static void removeItem() {
        System.out.println("Enter item name: ");
        String itemName = input.next();
        cookingList.removeItemFromList(itemName);
    }

    private static void replaceItemOnList() {
        System.out.println("Enter item position: ");
        int itemPosition = input.nextInt();
        input.nextLine();
        System.out.println("Enter item to replace: ");
        String newItem = input.next();
        cookingList.modifyList(itemPosition, newItem);
        System.out.println("Item at position " + (itemPosition + 1) + " on the list has been changed to " + newItem);
    }

    private static void searchItemOnList() {
        System.out.println("Search Item: ");
        String searchItem = input.next();
        cookingList.searchItemInList(searchItem);
    }

    private static void printList() {
        cookingList.printList();
    }

}
