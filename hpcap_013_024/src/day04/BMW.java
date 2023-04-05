package day04;

public class BMW extends Car{
    public BMW(){
        super("Blue");
        System.out.println("BMW Constructor");
    }
    public void engineCapacity(){
        System.out.println("3000cc");
    }
    public void changeColor(){
        color = "Blue";
        System.out.println("Color of BMW is " + color);
    }
}
