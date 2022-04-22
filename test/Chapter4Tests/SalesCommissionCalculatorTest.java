package Chapter4Tests;

import Chapter4.SalesCommissionCalculator1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesCommissionCalculatorTest {
    @Test
    public void salesPersonCanBeCreatedTest(){
        SalesCommissionCalculator1 salesCommissionCalculator1 = new SalesCommissionCalculator1();
        assertNotNull(salesCommissionCalculator1);
    }
    @Test
    public  void numberOfItemsCanBeSetTest(){
        SalesCommissionCalculator1 salesCommissionCalculator1 = new SalesCommissionCalculator1();
        salesCommissionCalculator1.setNumberOfItem(4);
        assertEquals(4, salesCommissionCalculator1.getNumberOfItem());
    }
}
