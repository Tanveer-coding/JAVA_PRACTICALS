import java.util.Scanner;

class ParkingTicket {

    String vehicleNo;
    int type;
    int hours;

    ParkingTicket(String vehicleNo, int type, int hours) {
        this.vehicleNo = vehicleNo;
        this.type = type;
        this.hours = hours;
    }

    int calculateFee() {

        if (type == 1)
            return hours * 10;

        return hours * 15;
    }

    void display(int ticketNo) {

        String vehicle = (type == 1) ? "Two Wheeler" : "Car";

        System.out.println("Ticket " + ticketNo + ": " +
                vehicleNo + " " + vehicle +
                " " + hours + " hours Fee Rs. " + calculateFee());
    }
}

public class UniversityParkingTicketSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        ParkingTicket[] tickets = new ParkingTicket[n];

        int revenue = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nVehicle " + (i + 1));

            System.out.print("Vehicle Number: ");
            String no = sc.nextLine();

            System.out.print("Type (1=Bike 2=Car): ");
            int type = sc.nextInt();

            System.out.print("Hours: ");
            int hrs = sc.nextInt();
            sc.nextLine();

            tickets[i] = new ParkingTicket(no, type, hrs);

            revenue += tickets[i].calculateFee();
        }

        System.out.println("\nTICKETS");

        for (int i = 0; i < n; i++)
            tickets[i].display(i + 1);

        System.out.println("Total Revenue : Rs. " + revenue);

        sc.close();
    }
}