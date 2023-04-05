package day02;

public class TestEmployee {
    public static void main(String[] args)
    {
        Employee emp[] = new Employee[5];
        emp[0] = new Employee(101, "AAA","BBB",54000);
        emp[1] = new Employee(102, "CCC","DDD",73000);
        emp[2] = new Employee(103, "EEE","FFF",23000);
        emp[3] = new Employee(104, "GGG","HHH",90000);
        emp[4] = new Employee(105, "III","JJJ",20000);
        for (int i = 0; i < 5; i++) {
            System.out.println(emp[i]);
        }
        System.out.println("------------After modifications------------");
        //Increasing 4th Employee salary
//        emp[3].salary += 777;
//        System.out.println(emp[3]);
//        emp[0].salary = 1000;
//        System.out.println(emp[0]);
        for (int i = 0; i < 5; i++) {
            if(emp[i].salary < 50000) {
                emp[i].salary += 9999;
                System.out.println(emp[i]);
            }
        }
     }
}
