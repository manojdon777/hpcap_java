package assignments;

public class SimpleInterest {
    public static void main(String[] args)
    {
        int principalAmount = 100000;
        float interestRate = 13.2f;
        int time = 4;
        float simpleInterest = (principalAmount * interestRate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
    }
}