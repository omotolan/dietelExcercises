package Chapter6;

import java.util.Scanner;

public class CovertTemperature {
    private static final double constant = 273.15;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double tempInCelsius;
        double tempInKelvin;

        System.out.println("Enter temperature in celsius to covert to kelvin: ");
        tempInCelsius = input.nextDouble();
        tempInKelvin = convertToKelvin(tempInCelsius);
        System.out.println(tempInCelsius + " celsius has been converted to: " + tempInKelvin + " kelvin.");

        System.out.println("Enter temperature in kelvin to convert to celsius: ");
        tempInKelvin = input.nextDouble();
        tempInCelsius = convertToCelsius(tempInKelvin);
        System.out.println(tempInKelvin + " kelvin has been converted to: " + tempInCelsius + " celsius.");

    }

    public static double convertToKelvin(double temperatureInCelsius) {
        double kelvin;
        kelvin = temperatureInCelsius + constant;
        return kelvin;
    }

    public static double convertToCelsius(double temperatureInKelvin) {
        double celsius;
        celsius = temperatureInKelvin - constant;
        return celsius;
    }
}
