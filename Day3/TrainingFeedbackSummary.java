package Day3;

import java.util.Scanner;

public class TrainingFeedbackSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int content;
        do {
            System.out.print("Content Rating (1-5): ");
            content = sc.nextInt();
        } while (content < 1 || content > 5);

        int explanation;
        do {
            System.out.print("Explanation Rating (1-5): ");
            explanation = sc.nextInt();
        } while (explanation < 1 || explanation > 5);

        int practical;
        do {
            System.out.print("Practical Rating (1-5): ");
            practical = sc.nextInt();
        } while (practical < 1 || practical > 5);

        int total = content + explanation + practical;
        double average = total / 3.0;

        System.out.println("\nTRAINING FEEDBACK");
        System.out.println("Student: " + name);
        System.out.println("Content: " + content + "/5");
        System.out.println("Explanation: " + explanation + "/5");
        System.out.println("Practical Work: " + practical + "/5");
        System.out.printf("Average Rating: %.2f/5\n", average);
    }
    
}
