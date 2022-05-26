package Chapter10.Chapter6;

import java.util.Random;

public class RandomNumbers {
    String firstExpression;
    String secondExpression;
    String thirdExpression;
    String forthExpression;
    String fifthExpression;
    String sixthExpression;
    Random random = new Random();

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.displayExpressions();

    }

    public void setRandomNumbers() {
        int firstNumber = random.nextInt(5) + 1;
        firstExpression = "2 <= " + firstNumber + " <= 6";

        int secondNumber = random.nextInt(49) + 1;
        secondExpression = "4 <= " + secondNumber + " <= 50";

        int thirdNumber = random.nextInt(6) + 1;
        thirdExpression = "0 <= " + thirdNumber + " <= 7";

        int forthNumber = random.nextInt(1029) + 1;
        forthExpression = "1000 <= " + forthNumber + " <= 1030";

        int fifthNumber = random.nextInt(-6, 1);
        fifthExpression = "-5 <= " + fifthNumber + " <= 1";

        int sixthNumber = random.nextInt(-3, 8) + 1;
        sixthExpression = "-2 <= " + sixthNumber + " <= 9 ";

    }

    public void displayExpressions() {
        setRandomNumbers();
        System.out.println(firstExpression);
        setRandomNumbers();
        System.out.println(secondExpression);
        setRandomNumbers();
        System.out.println(thirdExpression);
        setRandomNumbers();
        System.out.println(forthExpression);
        setRandomNumbers();
        System.out.println(fifthExpression);
        setRandomNumbers();
        System.out.println(sixthExpression);

    }

}
