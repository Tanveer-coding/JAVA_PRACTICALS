import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int marks;
    int attendance;

    void readData(Scanner sc) {

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        System.out.print("Enter Attendance (%): ");
        attendance = sc.nextInt();
    }

    String calculateResult() {

        if (marks >= 40)
            return "PASS";
        else
            return "FAIL";
    }

    void displayProfile() {

        System.out.println(rollNo + " - " + name + " - Marks: " + marks
                + " - Attendance: " + attendance + "% - " + calculateResult());
    }
}

public class StudentAcademicProfile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student students[] = new Student[n];

        for (int i = 0; i < n; i++) {

            students[i] = new Student();

            System.out.println("\nStudent " + (i + 1));
            students[i].readData(sc);
        }

        System.out.println("\n===== STUDENT PROFILES =====");

        for (Student s : students)
            s.displayProfile();

        sc.close();
    }
}