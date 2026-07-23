import java.util.Scanner;

public class MonthlySalesPerformance {

    static void readSales(double[] sales) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Month " + (i + 1) + " Sales: ");
            sales[i] = sc.nextDouble();
        }
    }

    static double calculateTotal(double[] sales) {

        double total = 0;

        for (double x : sales)
            total += x;

        return total;
    }

    static double calculateAverage(double[] sales) {

        return calculateTotal(sales) / sales.length;
    }

    static int countTargetMonths(double[] sales, double target) {

        int count = 0;

        for (double x : sales)

            if (x >= target)
                count++;

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sales[] = new double[12];

        System.out.println("Enter Sales for 12 Months");

        readSales(sales);

        System.out.print("Enter Target Sales: ");
        double target = sc.nextDouble();

        System.out.println("\n===== SALES PERFORMANCE =====");
        System.out.printf("Annual Sales : Rs. %.2f\n", calculateTotal(sales));
        System.out.printf("Average Monthly Sales : Rs. %.2f\n", calculateAverage(sales));
        System.out.println("Months Achieving Target : " + countTargetMonths(sales, target));

        sc.close();
    }
}