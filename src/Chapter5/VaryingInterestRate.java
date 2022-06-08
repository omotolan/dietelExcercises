package Chapter5;

public class VaryingInterestRate {
    public static void main(String[] args) {
        double principal = 1000.0;
        int rate;

        for (rate = 5; rate <= 10; rate++) {


            System.out.printf("%s     %s %n", "Year", "Amount on deposit");
            for (int year = 1; year <= 10; ++year) {

                double amount = principal * Math.pow((1.0 + (rate * 0.01)), year);

                System.out.printf("%4d%,20.2f%n", year, amount);

            }


        }
    }

}
