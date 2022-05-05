package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class CookingList {
    Scanner input = new Scanner(System.in);
    private ArrayList<String> myList = new ArrayList<>();


    public void printList() {
        System.out.println("you have " + myList.size() + " item(s) in your list.");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("item " + (i + 1) + ". " + myList.get(i));
        }
    }

    public int listSize() {
        return myList.size();
    }

    public void addItemToList(String item) {
        myList.add(item);
    }

    public void getItemFromList() {
        System.out.println("Enter item position: ");
        myList.get(input.nextInt());
    }

    public void modifyList(int oldItemPosition, String newItem) {
        myList.set(oldItemPosition, newItem);
    }

    public void searchItemInList(String itemSearch) {
        // boolean itemExists = myList.contains(item);
        int position = myList.indexOf(itemSearch);
        if (myList.contains(itemSearch)) {
            System.out.println("item " + itemSearch + " found and position of item is: " + (position + 1));
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

    public void removeItemFromList(String itemName) {
        if (myList.contains(itemName)) {
            myList.remove(itemName);
        } else {
            System.out.println("item not in list.");
        }
    }

    public void clearList() {
        myList.removeAll(myList);
    }
}
