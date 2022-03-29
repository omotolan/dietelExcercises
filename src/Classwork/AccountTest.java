package Classwork;

public class AccountTest {

    public static void main(String[] args) {

        Account firstAccount = new Account();
        firstAccount.amount = 0.00;
        firstAccount.name = "tolani";
        firstAccount.balance = 0.00;

        Account secondAccount = new Account();
        secondAccount.amount = 0.00;
        secondAccount.name = "akinsola";
        secondAccount.balance = 0.00;

        firstAccount.deposit(20000);
        System.out.println(firstAccount.balance);

        secondAccount.deposit(5000);
        System.out.println(secondAccount.balance);

        firstAccount.withdraw(10);
        System.out.println(firstAccount.balance);

        secondAccount.withdraw(2134);
        System.out.println(secondAccount.balance);

        firstAccount.withdraw(4000);
       // print(firstAccount.balance);
       System.out.println(firstAccount.balance);

        firstAccount.transfer(secondAccount, 500);
        System.out.println(firstAccount.balance);
        System.out.println(secondAccount.balance);
    }
}
