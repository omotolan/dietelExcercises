package tddClass;

public class Account {
    private int balance;
    public void deposit(int amount) {
        //amount = 100;
        if (amount < 0 ){
            amount = 0;
        }
        balance = amount + balance;
    }

    public int getBalance() {
       // return 100;
        return balance;
    }

    public void withdraw(int amount){
        //balance = 3000; for withdrawal
        //balance = balance - amount; withdrawal
       // balance = 500; // for excess withrawal
       // if (amount > balance){ // excess
          // balance = balance; // excess
        balance = 0;
        if (amount == 0);{
            balance = 0;
        }
    }
}