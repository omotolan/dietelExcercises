package Chapter3Test;

import Chapter3.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeTest {
    @Test
    public void employeeCanBeCreatedTest() {
        Employee employee = new Employee("", "", 0.0);
        assertNotNull(employee);
    }

    @Test
    public void setFirstNameTest() {
        Employee employee = new Employee("", "", 0.0);
        employee.setFirstName("tolani");
        assertEquals("tolani", employee.getFirstName());
    }

    @Test
    public void setLastNameTest() {
        Employee employee = new Employee("", "", 0.0);
        employee.setLastName("akinsola");
        assertEquals("akinsola", employee.getLastName());
    }

    @Test
    public void setMonthlySalary() {
        Employee employee = new Employee("", "", 0.0);
        employee.setMonthlySalary(200_000.00);
        assertEquals(200_000.00, employee.getMonthlySalary());
    }

    @Test
    public void calculateYearlySalaryTest() {
        Employee employee = new Employee("", "", 0.0);
        employee.setFirstName("ayuba");
        employee.setLastName("yusuf");
        employee.setMonthlySalary(200_000.00);
        assertEquals("ayuba", employee.getFirstName());
        assertEquals("yusuf", employee.getLastName());
        assertEquals(200_000.00, employee.getMonthlySalary());
        double result = employee.getYearlySalary(200_000.00);
        assertEquals(2_400_000.00, result);
    }
}
