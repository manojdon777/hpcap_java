package day02;
public class NonStaticDemo
{
    {
        System.out.println("Non static block");
    }
    static
    {
        System.out.println("Static block");
    }
    public NonStaticDemo()
    {
        System.out.println("Constructor");
    }
}