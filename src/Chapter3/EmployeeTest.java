package Chapter3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("tolani", "akinsola", 0.0);
        Employee employee2 = new Employee("fikayo", "olusesan", 0.0);

        // for first object
        System.out.println("---- first employee---");
        employee1.setMonthlySalary(20000.0);
        System.out.println(employee1.getMonthlySalary());
        employee1.getMonthlySalary(20000.0);
        System.out.println(employee1.getMonthlySalary(20000.0));
        employee1.percentageRaise(20000.0);
        System.out.println(employee1.percentageRaise(20000.0));


        System.out.println();

        //for second object
        System.out.println("----second employee----");
        employee2.setMonthlySalary(40000.0);
        System.out.println(employee2.getMonthlySalary());
        employee2.getMonthlySalary(40000.0);
        System.out.println(employee2.getMonthlySalary(40000.0));
        employee2.percentageRaise(40000.0);
        System.out.println(employee2.percentageRaise(40000.0));
    }
}
