import java.util.Scanner;

public class DailyExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double expense[] = new double[7];

        double total = 0;

        System.out.println("Enter Expenses for 7 Days");

        for (int i = 0; i < 7; i++) {

            while (true) {

                System.out.print("Day " + (i + 1) + ": ");
                expense[i] = sc.nextDouble();

                if (expense[i] >= 0)
                    break;

                System.out.println("Expense cannot be negative.");
            }

            total += expense[i];
        }

        System.out.print("Enter Daily Budget Limit: ");
        double budget = sc.nextDouble();

        int overBudget = 0;

        for (int i = 0; i < 7; i++) {

            if (expense[i] > budget)
                overBudget++;
        }

        double average = total / 7;

        System.out.println("\n===== EXPENSE REPORT =====");

        System.out.println("Daily Expenses:");

        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1) + " : Rs. " + expense[i]);
        }

        System.out.printf("\nTotal Spending : Rs. %.2f\n", total);
        System.out.printf("Average Daily Spending : Rs. %.2f\n", average);
        System.out.println("Days Above Budget : " + overBudget);

        sc.close();
    }
}