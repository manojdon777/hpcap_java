package day03;

public class TestString
{
    public static void main(String[] args)
    {
        String s1 = "Ashish";
        String s2 = "Ashish";
        if(s1 == s2)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
        if(s1.equals(s2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
        String s3 = new String("Ashish");
        if(s1 == s3)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
        if(s1.equals(s3))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}