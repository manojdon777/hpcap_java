package day04;

public class Fiat extends Car{
    public Fiat(){
        System.out.println("Fiat Constructor");
    }
    public void changeColor(){
        color = "White";
        System.out.println("Color of Fiat is " + color);
    }
}
