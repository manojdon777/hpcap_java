package day04;

public class Car {
    String color = "Red";
    public Car(){
        System.out.println("Car class constructor");
    }
    public Car(String color){
        this.color = color;
        System.out.println("Color of Car is " + color);
    }
    public void engineCapacity(){
        System.out.println("1300cc");
    }
}
