package eBanking;

import java.util.Scanner;

public class Atm {
    private static Scanner keyboard = new Scanner(System.in);
    private  static Bank zuBank = new Bank("Zubank", 10);
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        String prompt = """
                Welcome to ZuBank,
                Press softly
                1. To create account.
                2. To deposit money.
                3. To withdraw money.
                4. To send money.
                5. To check balance.
                6. To exit.
                """;

        System.out.println(prompt);
        int userResponse = keyboard.nextInt();
        switch (userResponse) {
            case 1 -> createAccount();
            case 2 -> deposit();
            case 3 -> withdrawal();
            case 4 -> transfer();
            case 5 -> checkBalance();
            case 6 -> exit();
            default -> runApp();
        }

    }

    private static void exit() {
        System.out.println("Thank you for banking with us");
        System.exit(0);
    }

    private static void transfer() {
        System.out.println("what is your account number?");
        String senderAccountNumber = keyboard.nextLine();
        System.out.println("receiver's account number?");
        String receiverAccountNumber = keyboard.nextLine();
        System.out.println("your pin");
        String pin = keyboard.next();
        System.out.println("how much?");
        int amount = keyboard.nextInt();

        zuBank.transfer(amount, senderAccountNumber, receiverAccountNumber, pin);
        Account fromAccount = zuBank.findAccount(Integer.parseInt(senderAccountNumber));

        System.out.println("new balance is " + fromAccount.getAccountBalance(pin));
        keyboard.next();
        runApp();
    }

    private static void deposit() {
        System.out.println("which account");
        String accountNumber = keyboard.next();
        Account account = zuBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("the account name is " + account.getAccountName());
        System.out.println("how much");
        int amount = keyboard.nextInt();
        zuBank.deposit(amount, accountNumber);

        System.out.println();
        System.out.println(account);
        System.out.println();
        keyboard.next();
        runApp();
    }

    private static void withdrawal() {
        System.out.println("which account");
        String accountNumber = keyboard.nextLine();
        System.out.println("your pin");
        String pin = keyboard.nextLine();
        System.out.println("how much");
        int amount = keyboard.nextInt();
        zuBank.withdraw(amount, accountNumber, pin);

        System.out.println("success!!!");
        Account account = zuBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println();
        System.out.println("new balance is " + account.getAccountBalance(pin));
        System.out.println();
        keyboard.next();
        runApp();
    }

    private static void checkBalance() {
        System.out.println("what's your avvount number");
        String accountNumber = keyboard.nextLine();
        System.out.println("your pin");
        String pin = keyboard.nextLine();
        Account account = zuBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("Your balance is" + account.getAccountBalance(pin));
    }

    private static void createAccount() {
        System.out.println("Enter your name");
        String firstName = keyboard.next();
        System.out.println("Enter your lastname");
        String lastName = keyboard.next();
        System.out.println("create pin");
        String pin = keyboard.next();
        System.out.println();
        System.out.println();
        Account savedAccount = zuBank.createAccountFor(firstName, lastName, pin);
        System.out.println(savedAccount);
        System.out.println();
        System.out.println();
        runApp();
    }
}
