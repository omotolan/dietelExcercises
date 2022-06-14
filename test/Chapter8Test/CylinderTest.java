package Chapter8Test;

import Chapter8.Cylinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CylinderTest {
    private Cylinder cylinder;

    @BeforeEach
    public void startWith() {
        cylinder = new Cylinder();
    }

    @Test
    public void cylinderObjectCanBeCreatedTest() {
        assertNotNull(cylinder);
    }

    @Test
    public void validateHeightInputTest() {
        cylinder.setHeight(34);
        assertEquals(34, cylinder.getHeight());

    }

    @Test
    public void validateRadiusInputTest() {
        cylinder.setRadius(21);
        assertEquals(21, cylinder.getRadius());
    }

    @Test
    public void calculateVolumeOfCylinderTest() {
        cylinder.setRadius(45);
        cylinder.setHeight(12);
        assertEquals(76340.70148223196, cylinder.calculateVolumeOfCylinder());
    }
}
