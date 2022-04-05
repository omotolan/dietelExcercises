package eBanking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BankTest {
    @Test
    public void bankCanBeCreated(){
        Bank accessBank = new Bank("Access Bank", 10);
        assertNotNull(accessBank);
        assertEquals("Acess Bank", accessBank.getName());
        assertEquals(10, accessBank.getMaxNumberOfCustomers());
    }
    @Test
    public void bankCanCreateAccountTest(){
        Bank accessBank = new Bank("Access Bank", 10);
        accessBank.createAccountFor("saheed", "osupa", "1234");
        assertEquals(1, accessBank.getNumberOfCustomers());
    }

}
