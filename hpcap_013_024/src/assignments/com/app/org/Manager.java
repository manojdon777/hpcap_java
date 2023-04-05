package assignments.com.app.org;

public class Manager extends Employee{
    double performanceBonus;
    public Manager(int empId, String empName, String deptId, double empBasic, double performanceBonus){
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.empBasic = empBasic;
        this.performanceBonus = performanceBonus;
    }
    public String toString() {
        return "ID = " + empId + ", Emp name = " + empName + ", Dept = " + deptId + ", Basic = " + empBasic + ", Performance Bonus = " + performanceBonus;
    }
    public double netSalary(){
        return empBasic + performanceBonus;
    }
    public double getPerformanceBonus(){
        return getEmpBasic() + 11000;
    }
}
