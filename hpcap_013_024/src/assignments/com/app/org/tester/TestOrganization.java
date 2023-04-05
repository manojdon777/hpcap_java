package assignments.com.app.org.tester;
import assignments.com.app.org.Employee;
import assignments.com.app.org.Manager;
import assignments.com.app.org.Worker;
import java.util.Scanner;
public class TestOrganization {

    public static void main(String[] args) {
        Employee[] emp = new Employee[20];
        Manager manager;
        Worker worker;
        Scanner sc = new Scanner(System.in);
        int choice, count = 0;
        while(true){
            System.out.println("\t************************************");
            System.out.println("\t\t\tEmp Management");
            System.out.println("\t\t\t1. Hire Manager");
            System.out.println("\t\t\t2. Hire Worker");
            System.out.println("\t\t\t3. Display All Emp");
            System.out.println("\t\t\t4. Update");
            System.out.println("\t\t\t5. Exit");
            System.out.println("\t************************************");
            System.out.print("\t\tChoose option : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    manager = new Manager(101, "Abc Xyz", "IT01", 30000, 10000);
                    emp[count] = manager;
                    count++;
                    break;
                case 2:
                    worker = new Worker(901, "Abc Xyz", "IT01", 18000, 5000,75,800);
                    emp[count] = worker;
                    count++;
                    break;
                case 3:
                    System.out.println("\t\t======== Display ========");
                    for(int i=0; i<count; i++)
                        if(emp[i] instanceof Manager) {
                            System.out.println(emp[i].netSalary());
                        }
                        else if(emp[i] instanceof Worker) {
                            System.out.println(((Worker) emp[i]).getHourlyRate());
                        }
                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("\t\tEnter proper choice : ");
                    break;
            }
        }
    }
}
