package assignments;
import java.lang.Math;

public class ArmStrong {
    int num;
    public ArmStrong(int num)
    {
        this.num = num;
    }
    public boolean checkArmStrong()
    {
        int sum = 0;
        int temp = num;
        int remainder;
        while(temp > 0)
        {
            remainder = temp%10;
            sum += remainder * remainder * remainder;
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args)
    {
        int num = 153;
        ArmStrong arm = new ArmStrong(num);
        if (arm.checkArmStrong())
            System.out.println(num + " is ArmStrong");
        else
            System.out.println(num + " is not ArmStrong");
    }
}
