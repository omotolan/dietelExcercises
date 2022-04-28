package Chapter9;

public class Employee {
    private String employeeNumber;
    private String employeeName;

    public Employee(String employeeNumber, String employeeName) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
