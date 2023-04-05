package assignments.com.app.org;

import assignments.Account;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNumber = 1001;
        boolean flag = true;
        double amount;
        Account acc = new Account(0, "", "", 1001);
        while(flag){
            System.out.println("\t\t\tBank Menu");
            System.out.println("\t\t\t1. Create Account");
            System.out.println("\t\t\t2. Deposit Money");
            System.out.println("\t\t\t3. Withdraw");
            System.out.println("\t\t\t4. Display Customer Info");
            System.out.println("\t\t\t5. Exit");
            System.out.print("\t\tChoose option : ");
            switch(sc.nextInt()){
                case 1:
                    System.out.print("\t\t\tEnter name of customer : ");
                    String name = sc.next();
                    String ifsc = "SBI00035";
                    System.out.print("\t\t\tEnter amount to deposit : ");
                    amount = sc.nextDouble();
                    acc = new Account(accountNumber, name, ifsc, amount);
                    amount++;
                    break;
                case 2:
                    System.out.print("\t\t\tEnter amount to deposit : ");
                    amount = sc.nextDouble();
                    acc.deposit(amount);
                    break;
                case 3:
                    System.out.print("\t\t\tEnter amount to withdraw : ");
                    amount = sc.nextDouble();
                    acc.withdraw(amount);
                    break;
                case 4:
                    System.out.println(acc);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("\t\t\tEnter Correct choice");
                    break;
            }
        }
    }
}
