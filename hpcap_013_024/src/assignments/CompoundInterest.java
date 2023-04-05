package assignments;

public class CompoundInterest
{
    public static void main(String[] args)
    {
        int principalAmount = 230000;
        float interestRate = 13.2f;
        int time = 4;
        float compoundInterest;

        float intermediate = 1.0f;

        for (int i = 0; i < time; i++)
        {
            intermediate *= (1 + interestRate/100);
        }
        compoundInterest = principalAmount * (intermediate - 1);
        System.out.println("Compound Interest = " + compoundInterest);
    }
}
