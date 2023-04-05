package day02;
public class AStatic
{
    static int i=10;
    int j = 20;
    public AStatic()
    {
        System.out.println("Constructor A");
    }
    static
    {
        System.out.println("Static A");
    }
}