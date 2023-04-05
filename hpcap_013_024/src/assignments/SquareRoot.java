package assignments;
public class SquareRoot
{
    public double squareRoot(int number)
    {
        return Math.sqrt(number);
    }
    public double sqrtWithoutLib(int number)
    {
        int i;
        for (i = 0; i*i <= number; i++);
        if ( (i-1)*(i-1) == number )
            return i-1;
        double low = i-1;
        double high = i;
        double mid;
        int count = 0;
        while(true)
        {
            mid = (low + high) / 2;
            System.out.println(mid);
            if (Math.abs( mid * mid - number) < 0.00001)
                break;
            else if( mid*mid > number )
                high = mid;
            else
                low = mid;
        }
        return mid;
    }
    public static void main(String[] args)
    {
        int number = 40;
        SquareRoot sq = new SquareRoot();
        System.out.println("Square root with sqrt function of number " + number + " = " + sq.squareRoot(number));
        System.out.println("Square root without sqrt function of number " + number + " = " + sq.sqrtWithoutLib(number));
    }
}
