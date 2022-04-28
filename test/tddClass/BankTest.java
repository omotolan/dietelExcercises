package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void depositTest() {
        Bank tolaniBank = new Bank();
        tolaniBank.deposit(300);
        assertEquals(300, tolaniBank.getBalance());
    }
}
