package assignments;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        int size = 2;
        int[] array = new int[size];
        int i = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag) {
            if (i == size){
                int temp[] = new int[2 * size];
                size *= 2;
            }
            for (int j = 0; j < size; j++) {

                System.out.print("Enter element : ");
                array[i] = sc.nextInt();
                i++;
            }

        }

    }
}
