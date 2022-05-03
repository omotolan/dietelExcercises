package Chapter7;

import java.util.Scanner;

public class CookingListTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CookingList cookingList = new CookingList();

        boolean quit = false;

        while (!quit) {
            cookingList.instruction();
            int option = input.nextInt();
            switch (option) {
                case 1 -> cookingList.addItem();
                case 2 -> cookingList.removeItem();
                case 3 -> cookingList.modifyList();
                case 4 -> cookingList.searchList();
                case 5 -> cookingList.printList();
                case 6 -> {
                    quit = true;
                    System.out.println("Thank you!!!");
                }
            }
        }
    }
}
