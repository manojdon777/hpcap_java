package day01;

public class PrimitiveArray
{
    public static void main(String[] args)
    {
        int iArray[] = new int[5];
        System.out.println(iArray);
        iArray[0] = 10;
        iArray[1] = 20;
        iArray[2] = 30;
        iArray[3] = 40;
        iArray[4] = 50;
        System.out.println(iArray);
        for (int i=0;i< iArray.length;i++)
        {
            System.out.println(iArray[i]);
        }
    }
}
