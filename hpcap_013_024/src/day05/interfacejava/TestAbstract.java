package day05.interfacejava;

public class TestAbstract {
    public static void main(String[] args) {
        IFly ifly = new SuperMan();
        ifly.fly();
        ifly = new Sparrow();
        ifly.fly();
        ifly = new AirPlane();
        ifly.fly();
    }
}
