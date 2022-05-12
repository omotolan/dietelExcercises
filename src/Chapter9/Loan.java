package Chapter9;

public class Loan {
    private int principalLoanAmount;
    private int loanTenure;

    private final int interestRate;


    public Loan(int principalLoanAmount, int loanTenure, int interestRate) {
        this.principalLoanAmount = principalLoanAmount;
        this.loanTenure = loanTenure;
        this.interestRate = interestRate;
    }

    public void setPrincipalLoanAmount(int principalLoanAmount) {
        this.principalLoanAmount = principalLoanAmount;
    }

    public void setLoanTenure(int loanTenure) {
        this.loanTenure = loanTenure;
    }

    public double getMonthlyPayment(){
        int amount = (principalLoanAmount * interestRate) / 100;
        int newAmount = principalLoanAmount + amount;
        return (double) newAmount/loanTenure;
    }
}
