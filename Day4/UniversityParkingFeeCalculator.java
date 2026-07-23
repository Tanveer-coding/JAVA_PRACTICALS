import java.util.Scanner;

public class UniversityParkingFeeCalculator {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vehicleType, hours, fee = 0;

        System.out.println("===== UNIVERSITY PARKING =====");
        System.out.println("1. Two Wheeler");
        System.out.println("2. Car");

        System.out.print("Enter Vehicle Type: ");
        vehicleType = sc.nextInt();

        System.out.print("Enter Parking Hours (1-12): ");
        hours = sc.nextInt();

        if (hours < 1 || hours > 12) {
            System.out.println("Invalid Parking Hours.");
            return;
        }

        switch (vehicleType) {

            case 1:
                fee = 10;
                if (hours > 1)
                    fee += (hours - 1) * 5;
                System.out.println("Vehicle : Two Wheeler");
                break;

            case 2:
                fee = 20;
                if (hours > 1)
                    fee += (hours - 1) * 10;
                System.out.println("Vehicle : Car");
                break;

            default:
                System.out.println("Invalid Vehicle Type");
                return;
        }

        System.out.println("Hours : " + hours);
        System.out.println("Parking Fee : Rs. " + fee);

        sc.close();
    }
}
