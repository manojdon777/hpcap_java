package day03;
public class TestEmployee
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.setEmpid(1);
        e1.setName("Ashish");
        e1.setSalary(90000);
        System.out.println(e1);
        System.out.println("Emp ID is = " + e1.getEmpid());
        System.out.println("Emp name is = " + e1.getName());
        System.out.println("Emp salary is = " + e1.getSalary());
        Employee e2 = new Employee();
        e2.setEmpid(1);
        e2.setName("Ashish");
        e2.setSalary(90000);
        System.out.println("Emp ID is = " + e2.getEmpid());
        System.out.println("Emp name is = " + e2.getName());
        System.out.println("Emp salary is = " + e2.getSalary());
        System.out.println(e1.equals(e2));
    }
}