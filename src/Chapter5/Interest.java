package Chapter5;

public class Interest {
    public static void main(String[] args) {
        int principal = 1000;
        int rate = 5 / 100;
        int ratee = 5 % 100;

        for (int year = 1; year <= 10; ++year) {
// calculate new amount on deposit for specified year
            int amountt = 1000 * ((1 + rate) * year);
            int amounttt = 1000 * ((1 + ratee) * year);
            double amount = principal * Math.pow(1.0 + rate, year);
// display the year and the amount
         //   System.out.printf("%4d%,20d%n, %s%n", year, amountt,"."+amounttt);
            System.out.println(year + "\t\t\t" + amountt + "." + amounttt);

        }
    }
}
