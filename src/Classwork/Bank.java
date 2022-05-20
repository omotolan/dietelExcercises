package Classwork;

public class Bank {
    private int balance;
    public void deposit(int amount){
        balance += amount;
    }
    public int getBalance(){
        return balance;
    }
}
