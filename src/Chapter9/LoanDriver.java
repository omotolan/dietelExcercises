package Chapter9;

import java.util.Scanner;

public class LoanDriver {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Loan loan = new Loan(0, 0, 20);
        HomeLoan homeLoan = new HomeLoan(0, 0, 12);
        VehicleLoan vehicleLoan = new VehicleLoan(0, 0, 15);
        PersonalLoan personalLoan = new PersonalLoan(0, 0, 25);

        int loanTenure = 0;

        loan.setPrincipalLoanAmount(getLoanAmount());
        loanTenure = getLoanTenure();
        loan.setLoanTenure(loanTenure);

        System.out.println("You are to pay " +loan.getMonthlyPayment() + " monthly for a period of " + loanTenure + " months");

        System.out.println();

        homeLoan.setPrincipalLoanAmount(getLoanAmount());
        loanTenure = getLoanTenure();
        homeLoan.setLoanTenure(loanTenure);
        System.out.println("You are to pay " + homeLoan.getMonthlyPayment() + " monthly for a period of " + loanTenure + " months");

        System.out.println();

        vehicleLoan.setPrincipalLoanAmount(getLoanAmount());
        loanTenure = getLoanTenure();
        vehicleLoan.setLoanTenure(loanTenure);
        System.out.println("You are to pay " + vehicleLoan.getMonthlyPayment()+ " monthly for a period of " + loanTenure + " months");

        System.out.println();

        personalLoan.setPrincipalLoanAmount(getLoanAmount());
        loanTenure = getLoanTenure();
        personalLoan.setLoanTenure(loanTenure);
        System.out.println("You are to pay " + personalLoan.getMonthlyPayment() + " monthly for a period of " + loanTenure + " months");
    }

    private static int getLoanAmount() {
        System.out.println("Enter principal loan amount: ");
        return input.nextInt();
    }

    private static int getLoanTenure() {
        System.out.println("Enter loan tenure in months: ");
        return input.nextInt();
    }
}
