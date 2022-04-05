package eBanking;

public class Bank {
    private final String name;
    private  Account[] accounts;
    private int numberOfCustomer;

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
        numberOfCustomer++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }
    public Account findAccount(int accountNumber){
        int indexOfAccount = accountNumber - 1;
        Account theAccount = accounts[indexOfAccount]; //delete this if you want to return the first
       // return accounts[indexOfAccount];
        return theAccount;
    }
}
