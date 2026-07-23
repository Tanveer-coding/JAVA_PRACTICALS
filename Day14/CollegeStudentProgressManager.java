import java.util.Scanner;

class Student {

    int roll;
    String name;
    int[] marks = new int[5];
    int attendance;

    Student(int roll, String name, int[] marks, int attendance) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    int getTotal() {
        int total = 0;
        for (int m : marks)
            total += m;
        return total;
    }

    double getAverage() {
        return getTotal() / 5.0;
    }

    String getResult() {
        return getAverage() >= 40 ? "PASS" : "FAIL";
    }

    String getAttendanceStatus() {
        return attendance >= 75 ? "Satisfactory" : "Shortage";
    }

    void display() {
        System.out.println(roll + " " + name +
                " Total: " + getTotal() +
                " Average: " + String.format("%.2f", getAverage()) +
                " Result: " + getResult() +
                " Attendance: " + getAttendanceStatus());
    }
}

public class CollegeStudentProgressManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Roll: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];

            System.out.println("Enter 5 Marks:");

            for (int j = 0; j < 5; j++)
                marks[j] = sc.nextInt();

            System.out.print("Attendance: ");
            int att = sc.nextInt();

            students[i] = new Student(roll, name, marks, att);
        }

        System.out.println("\nCLASS REPORT");

        for (Student s : students)
            s.display();

        sc.close();
    }
}