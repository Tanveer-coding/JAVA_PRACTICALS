import java.util.Scanner;

public class StudentGradeScholarship {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double percentage;
        int attendance;
        String grade;

        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();

        System.out.print("Enter Attendance: ");
        attendance = sc.nextInt();

        if (percentage < 0 || percentage > 100 ||
            attendance < 0 || attendance > 100) {

            System.out.println("Validation : Invalid Input");
            return;
        }

        if (percentage >= 85)
            grade = "A";
        else if (percentage >= 75)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 40)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n===== ACADEMIC DECISION =====");
        System.out.println("Grade : " + grade);

        if (percentage >= 85 && attendance >= 90)
            System.out.println("Scholarship : Eligible");
        else
            System.out.println("Scholarship : Not Eligible");

        System.out.println("Validation : Input Accepted");

        sc.close();
    }
}