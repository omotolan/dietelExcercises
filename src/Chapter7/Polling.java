package Chapter7;

import java.util.Scanner;

public class Polling {
    static Scanner input = new Scanner(System.in);
    static int[][] ratings = new int[5][10];
    static String[] topics = new String[]{"politics", "Global environmental issues",
            "World war", "Education", "Health"};

    public static void main(String[] args) {
      //  displayTopics();
        loadInput();
        displayRating();
    }


    public static int displayTopics() {
        int i;
        for ( i = 0; i < topics.length; i++) {
            System.out.println(topics[i] + ":");
        }
        return i;
    }


    public static void displayRating() {
        for (int i = 0; i < ratings.length; i++) {
            System.out.println();
            for (int j = 0; j < ratings[i].length; j++) {
                System.out.print(ratings[i][j] + " ");

            }
        }
    }

public static int collectRating(){
        int choice = 0;
    System.out.println("Enter rating 1-10: ");
     choice = input.nextInt();
    return choice;
}
    public static void loadInput() {

        int counter = 0;
        while (counter != 3) {

            for (int i = 0; i < topics.length; i++) {
                System.out.println(topics[i]);

                int choice = collectRating();
                switch (choice) {
                    case 1 -> ratings[i][0] = 1;
                    case 2 -> ratings[i][1] = 2;
                    case 3 -> ratings[i][2] = 3;
                    case 4 -> ratings[i][3] = 4;
                    case 5 -> ratings[i][4] = 5;
                    case 6 -> ratings[i][5] = 6;
                    case 7 -> ratings[i][6] = 7;
                    case 8 -> ratings[i][7] = 8;
                    case 9 -> ratings[i][8] = 9;
                    case 10 -> ratings[i][9] = 10;
                    default -> System.out.println("option does not exist");
                }
            }
            counter++;
        }
    }

}
