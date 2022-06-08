package Chapter6;

import java.util.Scanner;

public class SportRecommender {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Sport recommender");

        System.out.println("Enter temperature in celsius: ");

    }
    public static void sportRecommender(int temperatureInCelsius){
        if (temperatureInCelsius >= 20 && temperatureInCelsius <= 30 ){
            System.out.println("It’s lovely weather for sports today!");
        } else if (temperatureInCelsius > 10) {

        }

    }
}
