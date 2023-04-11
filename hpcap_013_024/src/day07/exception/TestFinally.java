package day07.exception;
public class TestFinally {
    public static void main(String[] args) {
        try{
            System.out.println(20/0);
        }catch (ArithmeticException e){
            System.out.println("/ by ZERO");
        }finally {
            System.out.println("inside Finally block");
        }
    }
}