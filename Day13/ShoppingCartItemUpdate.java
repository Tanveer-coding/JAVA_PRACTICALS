import java.util.Scanner;

class CartItem {

    String item;
    double unitPrice;
    int quantity;

    CartItem(String item, double unitPrice, int quantity) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    CartItem updateQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    double calculateAmount() {
        return unitPrice * quantity;
    }

    void display() {
        System.out.println("\nCART ITEM");
        System.out.println("Item : " + item);
        System.out.println("Unit Price : Rs. " + unitPrice);
        System.out.println("Updated Quantity : " + quantity);
        System.out.println("Current Total : Rs. " + calculateAmount());
    }
}

public class ShoppingCartItemUpdate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Item : ");
        String item = sc.nextLine();

        System.out.print("Unit Price : ");
        double price = sc.nextDouble();

        System.out.print("Initial Quantity : ");
        int qty = sc.nextInt();

        CartItem cart = new CartItem(item, price, qty);

        System.out.print("Updated Quantity : ");
        int newQty = sc.nextInt();

        cart.updateQuantity(newQty).display();

        sc.close();
    }
}