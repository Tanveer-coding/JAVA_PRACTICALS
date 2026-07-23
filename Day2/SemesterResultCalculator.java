import java.util.Scanner;

public class SemesterResultCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;

        do {
            System.out.print("Enter Marks of Subject 1 (0-100): ");
            m1 = sc.nextInt();
        } while (m1 < 0 || m1 > 100);

        do {
            System.out.print("Enter Marks of Subject 2 (0-100): ");
            m2 = sc.nextInt();
        } while (m2 < 0 || m2 > 100);

        do {
            System.out.print("Enter Marks of Subject 3 (0-100): ");
            m3 = sc.nextInt();
        } while (m3 < 0 || m3 > 100);

        do {
            System.out.print("Enter Marks of Subject 4 (0-100): ");
            m4 = sc.nextInt();
        } while (m4 < 0 || m4 > 100);

        do {
            System.out.print("Enter Marks of Subject 5 (0-100): ");
            m5 = sc.nextInt();
        } while (m5 < 0 || m5 > 100);

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500.0) * 100;
        boolean pass = percentage >= 40;

        System.out.println("\nSEMESTER RESULT");
        System.out.println("Total Marks: " + total + " / 500");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Result: " + (pass ? "PASS" : "FAIL"));
    }
}