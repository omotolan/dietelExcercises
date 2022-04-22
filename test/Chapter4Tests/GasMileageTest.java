package Chapter4Tests;

import Chapter4.GasMileage1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GasMileageTest {
    @Test
    public void gasMileageCanBeCreated() {
        GasMileage1 gasMileage1 = new GasMileage1(0, 0);
        assertNotNull(gasMileage1);
    }

    @Test
    public void gallonsCanBeSetTest() {
        GasMileage1 gasMileage1 = new GasMileage1(0, 0);
        gasMileage1.setGallons(12);
        assertEquals(12, gasMileage1.getGallons());
    }

    @Test
    public void milesCanBeSetTest() {
        GasMileage1 gasMileage1 = new GasMileage1(0, 0);
        gasMileage1.setMiles(100);
        assertEquals(100, gasMileage1.getMiles());
    }

    @Test
    public void calculateMilesPerGallonTest() {
        GasMileage1 gasMileage1 = new GasMileage1(0, 0);
        gasMileage1.setGallons(20);
        double result = gasMileage1.getMilesPerGallon();
        assertEquals(20, gasMileage1.getGallons());
        assertEquals(240.0, result);
    }

    @Test
    public void calculateGallonsPerMiles() {
        GasMileage1 gasMileage1 = new GasMileage1(0, 0);
        gasMileage1.setMiles(400);
        double result = gasMileage1.getGallonsPerMiles();
        assertEquals(400, gasMileage1.getMiles());
        assertEquals(33.00, result);

    }
}
