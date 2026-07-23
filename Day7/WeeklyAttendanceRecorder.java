import java.util.Scanner;

public class WeeklyAttendanceRecorder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int attendance[] = new int[7];
        int present = 0;

        System.out.println("Enter Attendance for 7 Days (1 = Present, 0 = Absent)");

        for (int i = 0; i < 7; i++) {

            while (true) {

                System.out.print("Day " + (i + 1) + ": ");
                attendance[i] = sc.nextInt();

                if (attendance[i] == 0 || attendance[i] == 1)
                    break;

                System.out.println("Invalid Input! Enter 0 or 1.");
            }

            if (attendance[i] == 1)
                present++;
        }

        int absent = 7 - present;
        double percentage = (present * 100.0) / 7;

        System.out.println("\n===== WEEKLY ATTENDANCE =====");
        System.out.println("Present Days : " + present);
        System.out.println("Absent Days : " + absent);
        System.out.printf("Attendance : %.2f%%\n", percentage);

        sc.close();
    }
}