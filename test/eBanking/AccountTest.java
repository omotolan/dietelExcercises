package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    private Account account;
    @BeforeEach
    public void startWith(){
        account = new Account("1234", "tolani", "akinsola", "4567");
    }
    @Test
    public void accountCreationTest(){
       // Account account = new Account("1234", "tolani", "akinsola", "4567");
        assertNotNull(account);
    }
    @Test
    public void balanceTest(){
        assertNotNull(account);
        account.getAccountBalance("4567");
        assertEquals(0, account.getAccountBalance("4567"));
    }

    @Test
    public void depositTest(){
        assertNotNull(account);
        account.getAccountBalance("4567");
        assertEquals(0, account.getAccountBalance("4567"));
        account.deposit(5_000_000);
        assertEquals(5_000_000, account.getAccountBalance("4567"));
    }
    @Test
    public void doubleDepositTest(){
        account.getAccountBalance("4567");
        assertEquals(0, account.getAccountBalance("4567"));
        account.deposit(5000);
        account.deposit(10000);
        assertEquals(15000, account.getAccountBalance("4567"));
    }
    @Test
    public void withdrawalTest(){
        account.getAccountBalance("4567");
        assertEquals(0, account.getAccountBalance("4567"));
        account.deposit(5000);
        account.withdrawal(2000, "4567");
        assertEquals(3000, account.getAccountBalance("4567"));
    }
    @Test
    public void accountBalanceReturnsZeroWhenPinIsWrong(){
        account.getAccountBalance("4567");
        assertEquals(0, account.getAccountBalance("4567"));
        account.deposit(5000);
        assertEquals(0, account.getAccountBalance("1234"));

    }

}
