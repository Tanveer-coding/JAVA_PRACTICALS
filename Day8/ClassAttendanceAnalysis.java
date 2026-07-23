import java.util.Scanner;

public class ClassAttendanceAnalysis {

    static void readAttendance(double[] values) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < values.length; i++) {

            while (true) {
                System.out.print("Attendance of Student " + (i + 1) + ": ");
                values[i] = sc.nextDouble();

                if (values[i] >= 0 && values[i] <= 100)
                    break;

                System.out.println("Invalid Attendance! Enter 0-100.");
            }
        }
    }

    static double calculateAverage(double[] values) {

        double total = 0;

        for (double x : values)
            total += x;

        return total / values.length;
    }

    static int countShortage(double[] values, double limit) {

        int count = 0;

        for (double x : values)

            if (x < limit)
                count++;

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        double attendance[] = new double[n];

        readAttendance(attendance);

        double avg = calculateAverage(attendance);

        int shortage = countShortage(attendance, 75);

        System.out.println("\n===== CLASS ATTENDANCE =====");
        System.out.printf("Class Average : %.2f%%\n", avg);
        System.out.println("Students Below 75% : " + shortage);

        sc.close();
    }
}