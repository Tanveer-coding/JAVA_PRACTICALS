import java.util.Scanner;

class Room {

    int roomNo;
    String roomType;
    double dailyRate;
    boolean available;

    Room(int roomNo, String roomType, double dailyRate) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        available = true;
    }

    void bookRoom(int days) {

        if (available) {

            available = false;

            double amount = dailyRate * days;

            System.out.println("\nBOOKING DETAILS");
            System.out.println("Room : " + roomNo + " - " + roomType);
            System.out.println("Days : " + days);
            System.out.println("Total Amount : Rs. " + amount);
            System.out.println("Status : Booked");
        }

        else {

            System.out.println("Room Already Booked.");
        }
    }
}

public class HotelRoomBookingObject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Room Number : ");
        int no = sc.nextInt();
        sc.nextLine();

        System.out.print("Room Type : ");
        String type = sc.nextLine();

        System.out.print("Daily Rate : ");
        double rate = sc.nextDouble();

        System.out.print("Stay Days : ");
        int days = sc.nextInt();

        Room r = new Room(no, type, rate);

        r.bookRoom(days);

        sc.close();
    }
}