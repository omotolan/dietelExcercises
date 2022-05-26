package Chapter10.Chapter6;

public class Allowance {
    static private double salary;

    public static void main(String[] args) {
        salary = calculateTakeHomePay(1_000_000);
        System.out.println(salary);

    }

    public static double calculateTakeHomePay(double basicSalary) {
        double takeHomePay = basicSalary;
        takeHomePay += calculateTransportAllowanceFrom(basicSalary);
        takeHomePay += getFeedAllowanceFrom(basicSalary);
        takeHomePay -= calculateTaxFrom(basicSalary);
        return takeHomePay;

    }

    private static double calculateTransportAllowanceFrom(double basicSalary) {
        final double TEN_PERCENT = 0.1;
        return TEN_PERCENT * basicSalary;
    }

    private static double getFeedAllowanceFrom(double basicSalary) {
        final double THREE_PERCENT = 0.03;
        return THREE_PERCENT * basicSalary;
    }

    private static double calculateTaxFrom(double basicSalary) {
        final double TWO_PERCENT = 0.02;
        return TWO_PERCENT * basicSalary;
    }
}
