package day03;
public class Employee
{
    private int empid;
    private String name;
    private double salary;
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getEmpid() {
        return empid;
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return "Employee details are " +"Emp ID = " + empid + ", Name = " + name + ", Salary = " + salary ;
    }

    @Override
    public boolean equals(Object obj) {
        return this.empid == ((Employee)obj).empid
                && this.name.equals(((Employee)obj).name)
                && this.salary == ((Employee)obj).salary;
    }

}
