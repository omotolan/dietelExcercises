package tddClass;

import Classwork.Account;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositTest() {
        //given
        Account tolaniAccount = new Account("tolani", "1234");
        //when
        tolaniAccount.deposit(100);
        //assert
        assertEquals(100, tolaniAccount.getBalance());

    }

    @Test
    public void depositTwiceTest() {
        //given
        Account tolaniAccount = new Account("tolani","1234" );
        //when
        tolaniAccount.deposit(100);
        tolaniAccount.deposit(100);
        //assert
        assertEquals(100 + 100, tolaniAccount.getBalance());
    }

    @Test
    public void depositThriceTest() {
        //given
        Account tolaniAccount = new Account("tolani","1234");
        //when
        tolaniAccount.deposit(100);
        tolaniAccount.deposit(100);
        tolaniAccount.deposit(500);
        //assert
        assertEquals(200 + 500, tolaniAccount.getBalance());
    }

    @Test
    @DisplayName("Test that negative deposit will not work")
    public void negativeDepositTest() {
        Account tolaniAccount = new Account("tolani", "1234");
        tolaniAccount.deposit(1000);
        tolaniAccount.deposit(-500);
        assertEquals(1000, tolaniAccount.getBalance());

    }
    /*@Test
    public void withdrawalTest(){
        Account tolaniAccount = new Account();
        tolaniAccount.withdraw(1000);
        assertEquals (2000, tolaniAccount.getBalance());
    }*/

    /* @Test
     public void withdrawalTestMoreThanBalance(){
         Account tolaniAccount = new Account();
         tolaniAccount.withdraw(1000);
         assertEquals(500, tolaniAccount.getBalance());


     }*/
    @Test
    public void withdrawalTestWithZeroBalancede() {
        Account tolaniAccount = new Account("tolani","1234");
        tolaniAccount.withdraw(1000);
        assertEquals(0, tolaniAccount.getBalance());

    }
}

