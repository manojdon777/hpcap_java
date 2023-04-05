package day05.abstractpackage;

public abstract class AbstractCar {
    public AbstractCar(){
        System.out.println("Parent class");
    }
    public abstract void doSomething();
    public void doNothing(){
        System.out.println("Car - doNothing");
    }
}
