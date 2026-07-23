import java.util.Scanner;

class Product {

    String id;
    String name;
    double price;
    int quantity;

    Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalValue() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("\nPRODUCT BILL");
        System.out.println("Product : " + id + " - " + name);
        System.out.println("Price : Rs. " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Value : Rs. " + calculateTotalValue());
    }
}

public class ProductBillingWithThis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Product ID : ");
        String id = sc.nextLine();

        System.out.print("Product Name : ");
        String name = sc.nextLine();

        System.out.print("Price : ");
        double price = sc.nextDouble();

        System.out.print("Quantity : ");
        int quantity = sc.nextInt();

        Product p = new Product(id, name, price, quantity);

        p.displayProduct();

        sc.close();
    }
}