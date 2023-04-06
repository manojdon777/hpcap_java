package day07.exception;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = sc.nextInt();
        System.out.println("Enter second value");
        int second = sc.nextInt();
        String s = null;
        try{
            System.out.println(first/second);
            System.out.println(s.length());
        }
        catch(ArithmeticException | NullPointerException ae){
//            ae.printStackTrace();
            System.out.println(ae.getMessage());
        }
        System.out.println("END GAME");
    }
}
