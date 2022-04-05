package Assignment;

import java.util.Random;

public class DieRoll {
    public static void main(String[] args) {
        Random dice = new Random();
        int firstDie = 1 + dice.nextInt(6);
        int secondDie = 1 + dice.nextInt(6);

        System.out.println(firstDie);
        System.out.println(secondDie);
        System.out.println("sum of the two die is: " + (firstDie+secondDie));
    }
}
