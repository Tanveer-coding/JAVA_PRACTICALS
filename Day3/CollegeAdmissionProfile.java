package Day3;

import java.util.Scanner;

public class CollegeAdmissionProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int rollNumber;
        do {
            System.out.print("Enter Roll Number: ");
            rollNumber = sc.nextInt();
        } while (rollNumber <= 0);

        sc.nextLine();

        System.out.print("Enter Programme: ");
        String programme = sc.nextLine();

        int semester;
        do {
            System.out.print("Enter Semester: ");
            semester = sc.nextInt();
        } while (semester <= 0);

        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.println("\nADMISSION PROFILE");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Programme: " + programme);
        System.out.println("Semester: " + semester);
        System.out.println("Email: " + email);
        System.out.println("City: " + city);
    }
}