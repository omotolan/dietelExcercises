package Chapter9.EmployeeC9;

public class EmployeeDriver {
    public static void main(String[] args) {
        CommissionModel commissionModel = new CommissionCompensationModel(0,0);
        CommissionModel commissionModel1 = new BasePlusCommissionCompensationModel(0,0,0);
        Employee employee = new Employee("tolani", "akinsola", "1232434",commissionModel);

        //casting
        CommissionCompensationModel d = (CommissionCompensationModel) commissionModel;


        Employee employee1 = new Employee("sikiri", "ayinde", "3435", commissionModel1);
        employee1.toString();
    }
}
