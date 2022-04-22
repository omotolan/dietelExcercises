package Chapter3Test;

import Chapter3.HealthProfile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.PresentationDirection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthProfileTest {
    private HealthProfile healthProfile;

    @BeforeEach
    public void startWith() {
        healthProfile = new HealthProfile("", "", 0, 0, 0000, "", 0.0, 0.0);
    }

    @Test
    public void healthProfileCanBeCreated() {
        assertNotNull(healthProfile);
    }

    @Test
    public void setFirstNameTest() {
        healthProfile.setFirstName("tolani");
        assertEquals("tolani", healthProfile.getFirstName());
    }

    @Test
    public void setLastNameTest() {
        healthProfile.setLastName("akinsola");
        assertEquals("akinsola", healthProfile.getLastName());
    }

    @Test
    public void setDayTest() {
        healthProfile.setDay(2);
        assertEquals(2, healthProfile.getDay());
    }

    @Test
    public void setMonthTest() {
        healthProfile.setMonth(11);
        assertEquals(11, healthProfile.getMonth());
    }

    @Test
    public void setYearTest() {
        healthProfile.setYears(2000);
        assertEquals(2000, healthProfile.getYears());
    }

    @Test
    public void setGenderTest() {
        healthProfile.setGender("male");
        assertEquals("male", healthProfile.getGender());
    }

    @Test
    public void getDateOfBirthTest() {
        healthProfile.setDay(22);
        healthProfile.setMonth(4);
        healthProfile.setYears(2022);
        String result = healthProfile.birthDetails();
        assertEquals("4/22/2022", result);
    }

    @Test
    public void setWeightTest() {
        healthProfile.setWeightInPounds(160.00);
        assertEquals(160, healthProfile.getWeightInPounds());
    }

    @Test
    public void setHeightTest() {
        healthProfile.setHeightInInches(72.00);
        assertEquals(72.0, healthProfile.getHeightInInches());
    }

    @Test
    public void getFullNameTest() {
        healthProfile.setFirstName("ayuba");
        healthProfile.setLastName("ayo");
        String result = healthProfile.getFullName();
        assertEquals("ayuba" + "ayo", result);
    }

    @Test
    public void getBirthDetailsTest() {
        healthProfile.setYears(2005);
        healthProfile.setMonth(4);
        healthProfile.setDay(22);
        String result = healthProfile.birthDetails();
        assertEquals("4/22/2005", result);
    }

    @Test
    public void calculateAgeTest() {
        int result = healthProfile.getAge(2005);
        assertEquals(17, result);
    }

    @Test
    public void maximumHeartRateTest() {
        healthProfile.getAge(2005);
        int result = healthProfile.maximumHeartRate();
        assertEquals(203, result);
    }

    @Test
    public void targetHeartRateTest() {
        healthProfile.getAge(2005);
        healthProfile.maximumHeartRate();
        int result = healthProfile.getTargetHeartRate();
        assertEquals(92, result);
    }

    @Test
    public void bodyMaxIndexCalTest() {
        healthProfile.setWeightInPounds(160.00);
        healthProfile.setHeightInInches(72.00);
        double result = healthProfile.getBodyMaxIndex();
        assertEquals(39.677500629881585, result);

    }
}
