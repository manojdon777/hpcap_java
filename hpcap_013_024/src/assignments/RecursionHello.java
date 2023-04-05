package assignments;


public class RecursionHello {
    public void recursion(int n){
        if(n==0)
            return;
        recursion(n-1);
        System.out.println("Hello " + n);
    }

    public static void main(String[] args) {
        RecursionHello rec = new RecursionHello();
        rec.recursion(10);
    }
}
