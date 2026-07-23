import java.util.Scanner;

public class CampusAreaUtility {

    // Square
    static double area(double side) {
        return side * side;
    }

    // Rectangle
    static double area(double length, double width) {
        return length * width;
    }

    // Circle
    static double area(int radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("===== AREA CALCULATOR =====");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        System.out.print("Enter Choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:

                System.out.print("Enter Side: ");
                double side = sc.nextDouble();

                System.out.println("\nAREA RESULT");
                System.out.println("Shape : Square");
                System.out.printf("Area : %.2f square units\n", area(side));
                break;

            case 2:

                System.out.print("Enter Length: ");
                double length = sc.nextDouble();

                System.out.print("Enter Width: ");
                double width = sc.nextDouble();

                System.out.println("\nAREA RESULT");
                System.out.println("Shape : Rectangle");
                System.out.printf("Area : %.2f square units\n", area(length, width));
                break;

            case 3:

                System.out.print("Enter Radius: ");
                int radius = sc.nextInt();

                System.out.println("\nAREA RESULT");
                System.out.println("Shape : Circle");
                System.out.printf("Area : %.2f square units\n", area(radius));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}