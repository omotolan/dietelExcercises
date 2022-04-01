package tddClass;

import Chapter3.PetrolPurchase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PetrolPurchaseTest {
    @Test
    public void PetrolPurchaseTest(){
            PetrolPurchase total = new PetrolPurchase("anywhere", "petrol", 9, 165.0, 9.0);
            total.setLocation("ojota");
            assertSame("ojota", total.getLocation());
            total.setPetrolType("diesel");
            assertSame("diesel", total.getPetrolType());
            total.setQuantity(9);
            assertEquals(9, total.getQuantity());
            total.setPricePerLiter(165.0);
            assertEquals(165.0, total.getPricePerLiter());
            total.setPercentageDiscount(8.0);
            assertEquals(8.0, total.getPercentageDiscount());
            total.getPurchaseAmount();
            assertEquals(1366.2, total.getPurchaseAmount());

    }
}
