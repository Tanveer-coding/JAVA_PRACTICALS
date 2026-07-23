import java.util.Scanner;

public class DigitalWalletMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;
        int choice;
        double amount;

        do {

            System.out.println("\n===== DIGITAL WALLET =====");
            System.out.println("1. Add Money");
            System.out.println("2. Make Payment");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    amount = sc.nextDouble();

                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Money Added Successfully.");
                    } else {
                        System.out.println("Invalid Amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    amount = sc.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid Amount.");
                    } else if (amount > balance) {
                        System.out.println("Insufficient Balance.");
                    } else {
                        balance -= amount;
                        System.out.println("Payment Successful.");
                    }
                    break;

                case 3:
                    System.out.printf("Current Balance : Rs. %.2f%n", balance);
                    break;

                case 4:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}