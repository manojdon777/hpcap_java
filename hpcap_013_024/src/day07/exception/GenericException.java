package day07.exception;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GenericException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        try{
            System.out.println(sc.nextInt());
            System.out.println(s.length());
        }catch(InputMismatchException e){
            System.out.println("InputMismatchException occured");
        }catch (Exception e){
            System.out.println("Exception occured");
        }
    }
}
