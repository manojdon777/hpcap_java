package day03;
import java.util.Scanner;
public class TestScanner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int i = sc.nextInt();
        System.out.println("Entered number is " + i);

        System.out.println("Please enter a word");
        String s = sc.next();
        System.out.println("Entered word is " + s);

        System.out.println("Please enter any float number");
        float f = sc.nextFloat();
        System.out.println("Entered float number is " + f);
    }
}
