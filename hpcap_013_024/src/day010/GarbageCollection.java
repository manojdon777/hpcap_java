package day010;

public class GarbageCollection {
    public static void main(String[] args) throws Throwable{
        GarbageCollection gcTest = new GarbageCollection();
        System.out.println(gcTest);
        System.out.println("Before GC");
        Runtime.getRuntime().gc();
//        gcTest.finalize();
        gcTest = null;
        System.out.println("After GC");
        Runtime.getRuntime().gc();
    }
    protected void finalize() throws Throwable {
        System.out.println("in finalize");
    }
}
