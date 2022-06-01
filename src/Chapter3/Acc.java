package Chapter3;

public class Acc {
    // double amount;
    double balance;

    public void deposit(double amount) {
        if (amount < 0){
            System.out.println("invalid amount");
        }
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
        if (amount > balance) {
            System.out.println("withdrawal amount exceeded account balance");
        }
    }

    public double getBalance() {
        return balance;

    }
}
