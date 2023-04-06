package day07.exception;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = sc.nextInt();
        System.out.println("Enter second value");
        int second = sc.nextInt();
        //tradition way
        if(second != 0)
            System.out.println(first/second);
        else
            System.out.println("Divisor can't be ZERO");
        try{
            System.out.println(first/second);
            System.out.println("JOB DONE");
        }
        catch(ArithmeticException ae){
//            ae.printStackTrace();
            System.out.println(ae.getMessage());
        }
        System.out.println("END GAME");
    }
}
