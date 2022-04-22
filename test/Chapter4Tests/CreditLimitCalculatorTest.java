package Chapter4Tests;

import Chapter4.Customer;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditLimitCalculatorTest {
    @Test
    public void accNumberTest(){
        //given
        Customer myCustomer = new Customer(0, 0, 0, 0, 0, 0);
        //when
        myCustomer.setAccountNumber(12345);
        //assert
        assertEquals(12345, myCustomer.getAccountNumber());
    }
    @Test
    public void balanceTest(){
        //given
        Customer myCustomer = new Customer(0, 0, 0, 0, 0, 0);
        //when
        myCustomer.setAccountNumber(12345);
        myCustomer.setBalanceAtBeginningOfMonth(2000);
        //assert
        assertEquals(12345, myCustomer.getAccountNumber());
        assertEquals(2000,  myCustomer.getBalanceAtBeginningOfMonth());
    }
    @Test
    public void totalItemsChargedTest(){
        //given
        Customer myCustomer = new Customer(0, 0, 0, 0, 0, 0);
        //when
        myCustomer.setAccountNumber(12345);
        myCustomer.setBalanceAtBeginningOfMonth(2000);
        myCustomer.setTotalOfItemsCharged(4000);
        //assert
        assertEquals(12345, myCustomer.getAccountNumber());
        assertEquals(2000,  myCustomer.getBalanceAtBeginningOfMonth());
        assertEquals(4000, myCustomer.getTotalOfItemsCharged());
    }
    @Test
    public void totalOfCreditsTest(){
        //given
        Customer myCustomer = new Customer(0, 0, 0, 0, 0, 0);
        //when
        myCustomer.setAccountNumber(12345);
        myCustomer.setBalanceAtBeginningOfMonth(2000);
        myCustomer.setTotalOfItemsCharged(4000);
        myCustomer.setTotalOfCredits(2000);
        //assert
        assertEquals(12345, myCustomer.getAccountNumber());
        assertEquals(2000,  myCustomer.getBalanceAtBeginningOfMonth());
        assertEquals(4000, myCustomer.getTotalOfItemsCharged());
        assertEquals(2000, myCustomer.getTotalOfCredits());

    }
    @Test
    public void creditLimitTest(){
        //given
        Customer myCustomer = new Customer(0, 0, 0, 0, 0, 0);
        //when
        myCustomer.setAccountNumber(12345);
        myCustomer.setBalanceAtBeginningOfMonth(2000);
        myCustomer.setTotalOfItemsCharged(4000);
        myCustomer.setTotalOfCredits(2000);
        myCustomer.setCreditLimit(3000);
        //assert
        assertEquals(12345, myCustomer.getAccountNumber());
        assertEquals(2000,  myCustomer.getBalanceAtBeginningOfMonth());
        assertEquals(4000, myCustomer.getTotalOfItemsCharged());
        assertEquals(2000, myCustomer.getTotalOfCredits());
        assertEquals(3000, myCustomer.getCreditLimit());

    }
    @Test
    public void creditLimitCalculatorTest(){
        //given
        Customer myCustomer = new Customer(0, 0, 0, 0, 0, 0);
        //when
        myCustomer.setAccountNumber(12345);
        myCustomer.setBalanceAtBeginningOfMonth(2000);
        myCustomer.setTotalOfItemsCharged(7000);
        myCustomer.setTotalOfCredits(5000);
        myCustomer.setCreditLimit(4000);
        myCustomer.setCreditLimitCalculator(2000, 7000, 5000);
        String result = myCustomer.getNewBalance();
        //assert
        assertEquals(12345, myCustomer.getAccountNumber());
        assertEquals(2000,  myCustomer.getBalanceAtBeginningOfMonth());
        assertEquals(7000, myCustomer.getTotalOfItemsCharged());
        assertEquals(5000, myCustomer.getTotalOfCredits());
        assertEquals(4000, myCustomer.getCreditLimit());
        assertEquals(5000, myCustomer.getCreditLimitCalculator());
        assertEquals("credit limit exceeded", result);

    }

}
