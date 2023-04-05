package day02;

public class Employee {
    int eid;
    String fname, lname;
    double salary;
    public Employee(int eid, String fname, String lname, double salary)
    {
        this.eid = eid;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;

    }
    public String toString(){
        return "Employee details are " +"Emp ID = " + eid + ", FName = " + fname + ", LName = " + lname + ", Salary = " + salary ;
    }
}
