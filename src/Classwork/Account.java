package Classwork;

public class Account {
    String name;
    double amount;
    double balance;

    public void deposit(int amount){
        this.amount += amount;
        this.balance=this.amount;

    }
    public boolean withdraw(int amount){
     if(balance<amount){
        System.out.println("insufficient balance");
        return false;
       }
     else{
         this.amount -= amount;
         this.balance=this.amount;
         System.out.println("transaction successful");
         return true;
       }

    }
    public void transfer(Account name, int amount){
        this.balance-=amount;
        name.balance +=  amount;
    }
    public double withdrawal(int amount){
        this.balance-=amount;
        return balance;
    }
}
