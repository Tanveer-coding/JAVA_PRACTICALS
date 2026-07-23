import java.util.Scanner;

public class FiveSubjectMarksDashboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];

        int total = 0;
        int pass = 0;
        int fail = 0;

        System.out.println("Enter Marks of 5 Subjects");

        for (int i = 0; i < 5; i++) {

            while (true) {

                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();

                if (marks[i] >= 0 && marks[i] <= 100)
                    break;

                System.out.println("Invalid Marks! Enter between 0-100.");
            }

            total += marks[i];

            if (marks[i] >= 40)
                pass++;
            else
                fail++;
        }

        double average = (double) total / 5;

        System.out.println("\n===== MARKS DASHBOARD =====");

        System.out.print("Marks : ");

        for (int i = 0; i < 5; i++)
            System.out.print(marks[i] + " ");

        System.out.println();

        System.out.println("Total : " + total);
        System.out.printf("Average : %.2f\n", average);
        System.out.println("Passed Subjects : " + pass);
        System.out.println("Failed Subjects : " + fail);

        sc.close();
    }
}