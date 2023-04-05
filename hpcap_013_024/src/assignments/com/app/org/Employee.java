package assignments.com.app.org;

public abstract class Employee {
    int empId;
    String empName, deptId;
    double empBasic;
    public double getEmpBasic() {
        return empBasic;
    }
    public abstract double netSalary();
}
