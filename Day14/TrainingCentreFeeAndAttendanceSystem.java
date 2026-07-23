import java.util.Scanner;

class Learner {

    String id;
    String name;
    double courseFee;
    double paid;
    int[] attendance;

    Learner(String id, String name,
            double courseFee,
            double paid,
            int[] attendance) {

        this.id = id;
        this.name = name;
        this.courseFee = courseFee;
        this.paid = paid;
        this.attendance = attendance;
    }

    double calculatePendingFee() {
        return courseFee - paid;
    }

    double attendancePercentage() {

        int present = 0;

        for (int a : attendance)

            if (a == 1)
                present++;

        return present * 100.0 / attendance.length;
    }

    String isCertificateEligible() {

        if (calculatePendingFee() == 0 &&
                attendancePercentage() >= 75)

            return "Eligible";

        if (calculatePendingFee() > 0)

            return "Not Eligible (Fee Pending)";

        return "Not Eligible (Low Attendance)";
    }

    void display() {

        System.out.println("\nLEARNER REPORT");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Pending Fee : Rs. " + calculatePendingFee());
        System.out.println("Attendance : " +
                String.format("%.2f", attendancePercentage()) + "%");
        System.out.println("Certificate : " + isCertificateEligible());
    }
}

public class TrainingCentreFeeAndAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Learner ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Course Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Amount Paid: ");
        double paid = sc.nextDouble();

        int[] attendance = new int[7];

        System.out.println("Enter Attendance (1/0):");

        for (int i = 0; i < 7; i++)
            attendance[i] = sc.nextInt();

        Learner l = new Learner(id, name, fee, paid, attendance);

        l.display();

        sc.close();
    }
}