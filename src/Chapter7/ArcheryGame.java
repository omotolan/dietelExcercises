package Chapter7;

import java.security.SecureRandom;

public class ArcheryGame {
    public static void main(String[] args) {

        display(play());

    }

    public static int[][] play() {
        SecureRandom random = new SecureRandom();
        return new int[][]{
                {random.nextInt(10), random.nextInt(10), random.nextInt(10)},
                {random.nextInt(10), random.nextInt(10), random.nextInt(10)},
                {random.nextInt(10), random.nextInt(10), random.nextInt(10)},
                {random.nextInt(10), random.nextInt(10), random.nextInt(10)}};
    }

    public static void display(int[][] archery) {
        // System.out.println("player number  " + "  first chance"+ "  second chance" + "  third chance" + "  total");
        for (int i = 0; i < archery.length; i++) {
            System.out.println();
            for (int j = 0; j < archery[i].length; j++) {

                System.out.print(archery[i][j] + " ");

            }
            int sum = total(i, archery);
            System.out.print(sum);
        }
    }

    public static int total(int playerNumber, int[][] game) {
        int sum = 0;
        System.out.println();
        for (int j = 0; j < game[playerNumber].length; j++) {
            sum += game[playerNumber][j];

        }
        return sum;
    }

}
