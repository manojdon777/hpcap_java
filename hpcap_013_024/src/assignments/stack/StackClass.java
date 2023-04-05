package assignments.stack;
import java.util.Scanner;
public class StackClass {
    int top = -1;
    final int size = 5;
    int iArray[] = new int[5];
    public void push(int value){
        if(top == size-1){
            System.out.println("OF");
        }
        else{
            top++;
            iArray[top] = value;
        }
    }
    public int pop(){
        int value;
        if(top == -1){
            System.out.println("UF");
            return -1;
        }
        else{
            value = iArray[top--];
            return value;
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(iArray[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        boolean done = true;
        StackClass ts = new StackClass();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (done) {
            System.out.println("\t\t1. Push");
            System.out.println("\t\t2. Pop");
            System.out.println("\t\t3. Display");
            System.out.println("\t\t4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter num ");
                    int num = sc.nextInt();
                    ts.push(num);
                    break;
                case 2:
                    int val = ts.pop();
                    if(val != -1)
                        System.out.println("Popped : "+ val);
                    break;
                case 3:
                    ts.display();
                    break;
                case 4:
                    done = false;
                    break;
            }
        }
    }
}
