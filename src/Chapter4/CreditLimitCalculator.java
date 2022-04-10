package Chapter4;

public class CreditLimitCalculator {
    static private String accountNumber;
    static private int balance = 5000;
    static private int charges = 7000;
    static private int creditLimit = 1000;
    public static void main(String[] args) {

        int newBalance = balance - charges - creditLimit;
        System.out.println(newBalance);
       if(creditLimit > newBalance){
           System.out.println("credit limit exceeded");
       }


    }
}
