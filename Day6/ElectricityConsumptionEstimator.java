import java.util.Scanner;

public class ElectricityConsumptionEstimator {

    // Room Bill
    static double calculateBill(int units) {
        return units * 6;
    }

    // Laboratory Bill
    static double calculateBill(int units, double equipmentCharge) {
        return (units * 6) + equipmentCharge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int units;
        double equipmentCharge;

        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println("1. Room");
        System.out.println("2. Laboratory");

        System.out.print("Enter Consumer Type: ");
        choice = sc.nextInt();

        System.out.print("Enter Units: ");
        units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid Units");
            return;
        }

        if (choice == 1) {

            double bill = calculateBill(units);

            System.out.println("\n===== ELECTRICITY ESTIMATE =====");
            System.out.println("Type : Room");
            System.out.printf("Total Cost : Rs. %.2f\n", bill);

        } else if (choice == 2) {

            System.out.print("Enter Equipment Charge: ");
            equipmentCharge = sc.nextDouble();

            double bill = calculateBill(units, equipmentCharge);

            System.out.println("\n===== ELECTRICITY ESTIMATE =====");
            System.out.println("Type : Laboratory");
            System.out.printf("Energy Charge : Rs. %.2f\n", (units * 6.0));
            System.out.printf("Equipment Charge : Rs. %.2f\n", equipmentCharge);
            System.out.printf("Total Cost : Rs. %.2f\n", bill);

        } else {
            System.out.println("Invalid Consumer Type");
        }

        sc.close();
    }
}