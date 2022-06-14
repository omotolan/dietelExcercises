package Chapter8;

public class SavingsAccount {
    private static int annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void setAnnualInterestRate(int annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
    public void calculateMonthlyInterestRate(){
        savingsBalance = (savingsBalance * annualInterestRate) / 12;
        

    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
