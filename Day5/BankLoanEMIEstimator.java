import java.util.Scanner;

public class BankLoanEMIEstimator {

    // Method to calculate Simple Interest
    public static double calculateInterest(double principal, double rate, int years) {
        return (principal * rate * years) / 100;
    }

    // Method to calculate Total Payable
    public static double calculateTotalPayable(double principal, double interest) {
        return principal + interest;
    }

    // Method to calculate Monthly Installment
    public static double calculateMonthlyInstallment(double totalPayable, int months) {
        return totalPayable / months;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal, rate;

        int years, months;

        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        rate = sc.nextDouble();

        System.out.print("Enter Loan Period (Years): ");
        years = sc.nextInt();

        System.out.print("Enter Number of Months: ");
        months = sc.nextInt();

        if (principal <= 0 || rate < 0 || years <= 0 || months <= 0) {
            System.out.println("Invalid Input.");
            return;
        }

        double interest = calculateInterest(principal, rate, years);
        double totalPayable = calculateTotalPayable(principal, interest);
        double emi = calculateMonthlyInstallment(totalPayable, months);

        System.out.println("\n===== LOAN ESTIMATE =====");
        System.out.printf("Simple Interest : Rs. %.2f\n", interest);
        System.out.printf("Total Payable   : Rs. %.2f\n", totalPayable);
        System.out.printf("Monthly EMI     : Rs. %.2f\n", emi);

        sc.close();
    }
}