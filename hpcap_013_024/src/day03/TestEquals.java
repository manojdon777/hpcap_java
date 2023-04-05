package day03;

public class TestEquals
{
    public static void main(String[] args)
    {
        Integer integer1 = new Integer(5);
        Integer integer2 = new Integer(5);
        String s1 = new String("Aa");
        System.out.println(integer1.equals(integer2));
        System.out.println(integer1.equals(s1));
        Double double1 = new Double(11.11);
        Double double2 = new Double(11.11);
        System.out.println(double1.equals(double2));
    }
}