package assignments;

public class SwapValue {
    public static void main(String[] args) {
        int xxx = 777;
        int yyy = 999;
        System.out.println("Before Swap");
        System.out.println("X = " + xxx + ", Y = " + yyy);
        xxx = xxx + yyy;
        yyy = xxx - yyy;
        xxx = xxx - yyy;
        System.out.println("After Swap");
        System.out.println("X = " + xxx + ", Y = " + yyy);

    }
}
