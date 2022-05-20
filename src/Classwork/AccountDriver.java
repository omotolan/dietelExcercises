package Classwork;

public class AccountDriver {

    public static void main(String[] args) {

        Account firstAccount = new Account("Akinsola Tolani", "1233443");

        Account secondAccount = new Account("jamie", "212232");
        System.out.println(secondAccount.getName());

        firstAccount.deposit(20000);
        System.out.println(firstAccount.getBalance());

        secondAccount.deposit(5000);
        System.out.println(secondAccount.getBalance());

        firstAccount.withdraw(10);
        System.out.println(firstAccount.getBalance());

        secondAccount.withdraw(2134);
        System.out.println(secondAccount.getBalance());

        firstAccount.withdraw(4000);
        // print(firstAccount.balance);
        System.out.println(firstAccount.getBalance());

        firstAccount.transfer(secondAccount, 500);
        System.out.println(firstAccount.getBalance());
        System.out.println(secondAccount.getBalance());

        //practiced assigning method to variable name
        double test = firstAccount.withdraw(200);
        System.out.println(test);


        // static method
        Account.setInterestRate(10);


        System.out.println("first account number balance is" + firstAccount.getBalance());
        System.out.println("second account number balance is" + secondAccount.getBalance());
    }
}
