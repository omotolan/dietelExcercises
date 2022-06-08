package Chapter5;

public class Interest {
    public static void main(String[] args) {
        int principal = 1000;
        double rate = 0.05;

        System.out.println("year\t\t" + "amount in year");
        for (int year = 1; year <= 10; ++year) {
            // calculate new amount on deposit for specified year

            double amount = principal * Math.pow(1.0 + (rate), year);
            double newAmount = amount * 100;

            newAmount = (int) newAmount % 100;

            // display the year and the amount
            System.out.println(year + "\t\t\t" + (int) amount + "." + (int)newAmount);

        }
    }
}
