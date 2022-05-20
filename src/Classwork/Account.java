package Classwork;

public class Account {
    private String name;
    private double balance;
    private String accountNumber;
    private static double interestRate;

    public Account(String name, String accNumber) {
        this.name = name;
        accountNumber = accNumber;
        interestRate = 0.0;
        balance = 0.0;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }


    public void deposit(int amount) {
        if (amount < 0) {
            balance = 0;
        } else {
            balance += amount;
        }
    }

    public void transfer(Account name, int amount) {
        balance -= amount;
        name.balance += amount;
    }

    public double withdraw(int amount) {
        if (amount > balance) {
            return balance;
        } else {
            return balance -= amount;
        }
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        if (interestRate > 0.0) {
            return balance += (balance * interestRate) / 100;
        } else {
            return balance;
        }
    }
}
