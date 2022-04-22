package Chapter3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("tolani", "akinsola", 0.0);
        Employee employee2 = new Employee("fikayo", "olusesan", 0.0);

        // for first object
        System.out.println("---- first employee---");
        employee1.setMonthlySalary(20000.0);
        System.out.println("monthly salary is " + employee1.getMonthlySalary());
        employee1.getYearlySalary(20000.0);
        System.out.println("yearly salary is " + employee1.getYearlySalary(20000.0));
        employee1.percentageRaise(20000.0);
        System.out.println("salary after 10% raise " + employee1.percentageRaise(20000.0));


        System.out.println();

        //for second object
        System.out.println("----second employee----");
        employee2.setMonthlySalary(40000.0);
        System.out.println("monthly salary is " + employee2.getMonthlySalary());
        employee2.getYearlySalary(40000.0);
        System.out.println("yearly salary is " + employee2.getYearlySalary(40000.0));
        employee2.percentageRaise(40000.0);
        System.out.println("salary after 10% raise " + employee2.percentageRaise(40000.0));
    }
}
