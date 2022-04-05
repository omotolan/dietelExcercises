package eBanking;

public class Bank {
    private final String name;
    private  Account[] accounts;
    public Bank(String bankName, int numberOfCustomer) {
        name = bankName;
        accounts = new Account[numberOfCustomer];
    }

    public String getName() {
        return name;
    }

    public Object getMaxNumberOfCustomers() {
        return accounts.length;
    }

    public void createAccountFor(String firstName, String lastName, String pin) {
    }

    public int getNumberOfCustomers() {
        return 0;
    }
}
