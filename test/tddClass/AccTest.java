package tddClass;

import Chapter3.Acc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccTest {
    @Test
    public void DepositTest() {
        Acc tola = new Acc();
        assertEquals(0.0, tola.getBalance());
        tola.deposit(5000.0);
        assertEquals(5000.0, tola.getBalance());
    }

    @Test
    public void WithdrawalTest() {
        Acc tola = new Acc();
        tola.deposit(5000.0);
        assertEquals(5000.0, tola.getBalance());
        tola.withdrawal(6000);
        tola.getBalance();
    }
}
