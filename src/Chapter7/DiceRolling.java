package Chapter7;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random random = new Random();

        int[] counter = new int[11];
        for (int i = 0; i < 36_000_000; i++) {


            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            int sumOfDice = die1 + die2;

            switch (sumOfDice) {
                case 2:
                    counter[0]++;
                case 3:
                    counter[1]++;
                case 4:
                    counter[2]++;
                case 5:
                    counter[3]++;
                case 6:
                    counter[4]++;
                case 7:
                    counter[5]++;
                case 8:
                    counter[6]++;
                case 9:
                    counter[7]++;
                case 10:
                    counter[8]++;
                case 11:
                    counter[9]++;
                case 12:
                    counter[10]++;

            }
        }
        for (int j : counter) {
            System.out.println(j);

        }

    }
}
