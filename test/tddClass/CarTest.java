package tddClass;

import Chapter3.Car;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CarTest{
    @Test
    public void CarToyotaTest() {
        Car toyota = new Car(" ", " ", 0.0);
        toyota.setModel("toyota");
        assertSame("toyota", toyota.getModel());
        toyota.setYear("2020");
        assertSame("2020", toyota.getYear());
        toyota.setPrice(3_000.0);
        assertEquals(3_000.0, toyota.getPrice());
        toyota.discountedPrice5();
        assertEquals(1_500_000.0, toyota.discountedPrice5());

    }
    @Test
    public void CarBenzTest() {
        Car benz = new Car(" ", " ", 0.0);
        benz.setModel("4Matic");
        assertSame("4Matic", benz.getModel());
        benz.setYear("2022");
        assertSame("2022", benz.getYear());
        benz.setPrice(4_000.0);
        assertEquals(4_000.0, benz.getPrice());
        benz.discountedPrice7();
        assertEquals(280_0000.0, benz.discountedPrice7());


    }
}

