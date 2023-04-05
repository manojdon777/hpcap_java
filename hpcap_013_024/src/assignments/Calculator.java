package assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int a, b;
        while(true){
            System.out.println("\t************************************");
            System.out.println("\t\t\tCalculator");
            System.out.println("\t\t\t1. Add");
            System.out.println("\t\t\t2. Subtract");
            System.out.println("\t\t\t3. Multiply");
            System.out.println("\t\t\t4. Divide");
            System.out.println("\t\t\t5. Mod");
            System.out.println("\t\t\t6. Exit Calculator");
            System.out.println("\t************************************");
            System.out.print("\t\tChoose operation : ");

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("\t\tEnter two numbers : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("\t\tAddition of " + a + " and " + b + " is ==> " + (a + b));
                    break;
                case 2:
                    System.out.print("\t\tEnter two numbers : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("\t\tSubtraction of " + a + " and " + b + " is ==>  " + (a - b));
                    break;
                case 3:
                    System.out.print("\t\tEnter two numbers : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("\t\tMultiplication of " + a + " and " + b + " is ==>  " + (a * b));
                    break;
                case 4:
                    System.out.print("\t\tEnter two numbers : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    if(b == 0) {
                        System.out.println("\t\tValue of b should be nonzero : ");
                        continue;
                    }
                    System.out.println("\t\tDivision " + a + " and " + b + " is ==> " + (a / b));
                    break;
                case 5:
                    System.out.print("\t\tEnter two numbers : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("\t\tMod of " + a + " and " + b + " is ==> " + (a % b));
                    break;

                case 6:
                    System.exit(0);
                default:
                    System.out.println("\t\tEnter Correct choice");
                    break;

            }
        }
    }
}
