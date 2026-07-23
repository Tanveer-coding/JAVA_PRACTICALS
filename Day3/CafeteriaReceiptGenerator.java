package Day3;

import java.util.Scanner;

public class CafeteriaReceiptGenerator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        double unitPrice;
        do {
            System.out.print("Enter Unit Price: ");
            unitPrice = sc.nextDouble();
        } while (unitPrice < 0);

        int quantity;
        do {
            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();
        } while (quantity <= 0);

        double gstRate;
        do {
            System.out.print("Enter GST Rate: ");
            gstRate = sc.nextDouble();
        } while (gstRate < 0);

        double subtotal = unitPrice * quantity;
        double gst = subtotal * gstRate / 100;
        double grandTotal = subtotal + gst;

        System.out.println("\n-----------------------------");
        System.out.println("CAFETERIA RECEIPT");
        System.out.println("-----------------------------");
        System.out.println("Item: " + item);
        System.out.printf("Subtotal: Rs. %.2f\n", subtotal);
        System.out.printf("GST: Rs. %.2f\n", gst);
        System.out.printf("Grand Total: Rs. %.2f\n", grandTotal);
        System.out.println("-----------------------------");
    
}
}
