import java.util.Scanner;

public class OnlineOrderBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price;
        int quantity;
        double deliveryCharge;
        double discountPercentage;

        do {
            System.out.print("Enter Item Price: ");
            price = sc.nextDouble();
        } while (price < 0);

        do {
            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();
        } while (quantity <= 0);

        do {
            System.out.print("Enter Delivery Charge: ");
            deliveryCharge = sc.nextDouble();
        } while (deliveryCharge < 0);

        do {
            System.out.print("Enter Discount Percentage: ");
            discountPercentage = sc.nextDouble();
        } while (discountPercentage < 0 || discountPercentage > 100);

        double subtotal = price * quantity;
        double discount = subtotal * discountPercentage / 100;
        double finalAmount = subtotal - discount + deliveryCharge;

        System.out.println("\nORDER BILL");
        System.out.printf("Subtotal: Rs. %.2f\n", subtotal);
        System.out.printf("Discount: Rs. %.2f\n", discount);
        System.out.printf("Delivery Charge: Rs. %.2f\n", deliveryCharge);
        System.out.printf("Final Payable Amount: Rs. %.2f\n", finalAmount);
    }
}