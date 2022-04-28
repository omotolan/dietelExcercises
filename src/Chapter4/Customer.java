package Chapter4;

public class Customer {
    private int accountNumber;
    private int balanceAtBeginningOfMonth;
    private int totalOfItemsCharged;
    private int totalOfCredits;
    private int creditLimit;
    private int newBalance;

    public Customer(int accountNumber, int balanceAtBeginningOfMonth, int totalOfItemsCharged, int totalOfCredits, int creditLimit, int newBalance) {
        this.accountNumber = accountNumber;
        this.balanceAtBeginningOfMonth = balanceAtBeginningOfMonth;
        this.totalOfItemsCharged = totalOfItemsCharged;
        this.totalOfCredits = totalOfCredits;
        this.creditLimit = creditLimit;
        this.newBalance = newBalance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalanceAtBeginningOfMonth() {
        return balanceAtBeginningOfMonth;
    }

    public void setBalanceAtBeginningOfMonth(int balanceAtBeginningOfMonth) {
        this.balanceAtBeginningOfMonth = balanceAtBeginningOfMonth;
    }

    public int getTotalOfItemsCharged() {
        return totalOfItemsCharged;
    }

    public void setTotalOfItemsCharged(int totalOfItemsCharged) {
        this.totalOfItemsCharged = totalOfItemsCharged;
    }

    public int getTotalOfCredits() {
        return totalOfCredits;
    }

    public void setTotalOfCredits(int totalOfCredits) {
        this.totalOfCredits = totalOfCredits;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditLimitCalculator(int balanceAtBeginningOfMonth, int totalOfItemsCharged, int totalOfCredits) {
        this.totalOfCredits = totalOfCredits;
        this.balanceAtBeginningOfMonth = balanceAtBeginningOfMonth;
        this.totalOfItemsCharged = totalOfItemsCharged;

        newBalance = this.balanceAtBeginningOfMonth + this.totalOfItemsCharged - this.totalOfCredits;


    }

    public int getCreditLimitCalculator() {
        return newBalance;
    }

    public String getNewBalance() {
        String message = "credit limit exceeded";
        // this.newBalance = newBalance;
        if (this.creditLimit < this.newBalance) {
            return message;
        }

        return message;


    }
}
