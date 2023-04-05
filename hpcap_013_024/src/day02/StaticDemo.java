package day02;
public class StaticDemo {
    public static void main(String[] args)
    {
        System.out.println(AStatic.i);
//        System.out.println(AStatic.j);
        AStatic a = new AStatic();
        System.out.println(a.j);
    }
}