package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BankTest {
    private Bank accessBank;
    @BeforeEach
            public  void setUp(){
    accessBank = new Bank("Access Bank", 10);
    }
    @Test
    public void bankCanBeCreated(){
        accessBank = new Bank("Access Bank", 10);
        assertNotNull(accessBank);
        assertEquals("Access Bank", accessBank.getName());
        assertEquals(10, accessBank.getMaxNumberOfCustomers());
    }
    @Test
    public void bankCanCreateAccountTest(){
        accessBank = new Bank("Access Bank", 10);
        accessBank.createAccountFor("saheed", "osupa", "1234");
        accessBank.createAccountFor("saheed", "osupa", "1234");
        assertEquals(2, accessBank.getNumberOfCustomers());
    }
    @Test
    public void createAccountCheckForCustomerByAccountNumberTest(){
        accessBank.createAccountFor("saheed", "osupa", "1234");
        accessBank.createAccountFor("wasiu", "osupa", "1234");
        accessBank.createAccountFor("tolani", "akinsola", "1234");
        assertEquals(3, accessBank.getNumberOfCustomers());
        Account account = accessBank.findAccount(3);
        assertEquals(3, accessBank.getNumberOfCustomers());

    }
    @Test
    public void bankDepositMoneyTest(){
        accessBank.createAccountFor("wasiu", "osupa", "1234");
        accessBank.deposit(1200, "1");
        Account account = accessBank.findAccount(1);
        assertEquals(1200, account.getAccountBalance("1234"));
    }
    @Test
    public void bankCanDepositMoneyTest(){
        accessBank.createAccountFor("sahees", "osupa", "1234");
        accessBank.deposit(1200, "1");
        accessBank.deposit(1800, "1");

        Account account = accessBank.findAccount(1);
        assertEquals(3000, account.getAccountBalance("1234"));
    }
    @Test
    public void bankCanWithdrawMoneyTest(){
        accessBank.createAccountFor("saheed", "osupa", "1234");
        accessBank.deposit(1200, "1");
        Account account = accessBank.findAccount(1);
        assertEquals(1200, account.getAccountBalance("1234"));

        accessBank.withdraw(200, "1", "1234");
        assertEquals(1000, account.getAccountBalance("1234"));
    }
    @Test
    public void bankCanTransferMoneyTest(){
        accessBank.createAccountFor("saheed", "osupa", "1234");
        accessBank.createAccountFor("amaka", "amazing", "1234");

        accessBank.deposit(12000, "1");

        Account account = accessBank.findAccount(1);
        assertEquals(12000, account.getAccountBalance("1234"));
        //when
        accessBank.transfer(200, "1","2","1234");
        //assert
        account = accessBank.findAccount(1);
        assertEquals(11800, account.getAccountBalance("1234"));

        account = accessBank.findAccount(2);
        assertEquals(200, account.getAccountBalance("1234"));
    }

}
