package Classwork;

public class AccountTest {

    public static void main(String[] args) {

        Account firstAccount = new Account("267723763873");
        firstAccount.amount = 0.00;
        firstAccount.name = "tolani";
        firstAccount.balance = 0.00;

        Account secondAccount = new Account("48038937842");
        secondAccount.amount = 0.00;
        secondAccount.name = "akinsola";
        secondAccount.balance = 0.00;
        System.out.println(secondAccount.name);

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

        //practiced assigning method to variable name
        double test = firstAccount.withdrawal(200);
        System.out.println(test);
        System.out.println(firstAccount.withdrawal(200));

        // static method
        Account.setInterestRate(10);

        firstAccount.addInterest();
        secondAccount.addInterest();

        System.out.println("first account number balance is"+firstAccount.addInterest());
       System.out.println("second account number balance is"+secondAccount.addInterest());
    }
}