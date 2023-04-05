package assignments.com.app.org;

public class Worker extends Employee{
    int hoursWorked;
    double hourlyRate;
    public Worker(int empId, String empName, String deptId, double empBasic, double performanceBonus, int hoursWorked, int hourlyRate){
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.empBasic = empBasic;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    public String toString() {
        return "ID = " + empId + ", Emp name = " + empName + ", Dept = " + deptId + ", Basic = " + empBasic + ", Hours worked = " + hoursWorked + ", Hourly rate = " + hourlyRate;
    }
    public double netSalary(){
        return empBasic + hourlyRate * hoursWorked;
    }
}
