package Classwork;

public class Account {
    String name;
    double amount;
    double balance;

    public void deposit(int amount){
        this.amount += amount;
        this.balance=this.amount;

    }
    public void withdraw(int amount){
        this.amount -= amount;
        this.balance=this.amount;
//        if(balance<amount){
//            System.out.println("insufficient balance");
//        }
//        else{
//            System.out.println("transaction successful");
//        }
    }
    public void transfer(Account name, int amount){
        this.balance-=amount;
        name.balance +=  amount;
    }
}
