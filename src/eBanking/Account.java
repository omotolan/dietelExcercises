package eBanking;

public class Account {
    private final String ACCOUNT_NUMBER;
    String accountName;
    private int balance = 0;
    private String pin;


    public Account(String accNum, String firstName, String lastName, String pin) {
        ACCOUNT_NUMBER = accNum;
        accountName = firstName + " " + lastName;
        this.pin = pin;
    }

    public int getAccountBalance(String pin) {
        if (pin.equals(this.pin)) {
            return balance;
        }
        return 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        String toReturn = String.format("""
                Account Name: %s
                Account Number: %s
                Balance: %d
                """, accountName, ACCOUNT_NUMBER, balance);
        return toReturn;
    }

    public void withdrawal(int amount, String pin) {
        if (pin.equals(this.pin)) {
            balance -= amount;
        }
    }

    public String getAccountName() {
        return accountName;
    }
}
