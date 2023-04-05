package assignments;
import java.util.Scanner;
public class FoodMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int quantity, totalBill = 0;
        int pohaQuantity = 1, idliQuantity = 0, wadaQuantity = 0,teaQuantity = 0;
        boolean pohaF = false, idliF = false, wadaF = false,teaF = false;
        String canteenName = " Ashish Sir Canteen ";
        while(true){
            System.out.println("\t*******" +  canteenName + "*********");
            System.out.println("\t\t\tMenu");
            System.out.println("\t\t\t1. Poha --> Rs.18");
            System.out.println("\t\t\t2. Idli --> Rs.20");
            System.out.println("\t\t\t3. Wada --> Rs.25");
            System.out.println("\t\t\t4. Tea  --> Rs.12");
            System.out.println("\t\t\t5. Exit and generate bill");
            System.out.println("\t************************************");
            System.out.print("\t\tEnter Menu : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    pohaF = true;
                    System.out.print("\t\tEnter quantity for Poha : ");
                    pohaQuantity = sc.nextInt();
                    totalBill += 18 * pohaQuantity;
                    break;
                case 2:
                    idliF = true;
                    System.out.print("\t\tEnter quantity for Idli : ");
                    idliQuantity = sc.nextInt();
                    totalBill += 20 * idliQuantity;
                    break;
                case 3:
                    wadaF = true;
                    System.out.print("\t\tEnter quantity for Wada : ");
                    wadaQuantity = sc.nextInt();
                    totalBill += 25 * wadaQuantity;
                    break;
                case 4:
                    teaF = true;
                    System.out.print("\t\tEnter quantity for Tea : ");
                    teaQuantity = sc.nextInt();
                    totalBill += 12 * teaQuantity;
                    break;
                case 5:
                    System.out.printf("\t\t\t----------------------------%n");
                    System.out.printf("\t\t\t|   %s%n", canteenName);
                    System.out.printf("\t\t\t----------------------------%n");
                    System.out.printf("\t\t\t| %s | %-4s | %3s | %3s %n", "Item", "Rates", "Qty", "Amt");
                    System.out.printf("\t\t\t----------------------------%n");
                    if(pohaF)
                        System.out.printf("\t\t\t| %-4s |  %03d  | %03d | %1d%n", "Poha", 18, pohaQuantity, 18 * pohaQuantity);
                    if(idliF)
                        System.out.printf("\t\t\t| %-4s |  %03d  | %03d | %1d%n", "Idli", 20, idliQuantity, 20 * idliQuantity);
                    if(wadaF)
                        System.out.printf("\t\t\t| %-4s |  %03d  | %03d | %1d%n", "Wada", 25, wadaQuantity, 25 * wadaQuantity);
                    if(teaF)
                        System.out.printf("\t\t\t| %-4s |  %03d  | %03d | %1d%n", "Tea", 10, teaQuantity, 10 * teaQuantity);
                    System.out.printf("\t\t\t----------------------------%n");
                    System.out.printf("\t\t\t|%22s%d%n", "Total = ",totalBill);
                    System.out.printf("\t\t\t----------------------------%n");
                    System.exit(0);
                default:
                    System.out.print("\t\tEnter Correct choice : ");
                    break;
            }
            System.out.println("\t\tCurrent bill is = " + totalBill);
        }
    }
}
