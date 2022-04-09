package Classwork;

public class Account {
    String name = "";
    double amount = 0.0;
   static double balance = 0.0;
    private static String accountNumber = "";
    public static double interestRate = 0;

    public Account(String accNumber){
        this.accountNumber = accNumber;
    }
    public static void setInterestRate(double interest){
        interestRate = interest;
    }

    public double  addInterest(){
        balance += (balance * interestRate)/100;
        return balance;
    }

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
         this.balance = this.amount;
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
