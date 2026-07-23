import java.util.Scanner;

public class TaxAdjustedArray {

    static double[] addTax(double[] prices, double taxRate) {

        double[] newPrices = new double[prices.length];

        for (int i = 0; i < prices.length; i++) {

            newPrices[i] = prices[i] + (prices[i] * taxRate / 100);
        }

        return newPrices;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Items: ");
        int n = sc.nextInt();

        double prices[] = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Price " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        System.out.print("Enter GST Percentage: ");
        double gst = sc.nextDouble();

        double adjusted[] = addTax(prices, gst);

        System.out.println("\n===== ORIGINAL PRICES =====");

        for (double x : prices)
            System.out.printf("%.2f ", x);

        System.out.println("\n\n===== GST ADJUSTED PRICES =====");

        for (double x : adjusted)
            System.out.printf("%.2f ", x);

        sc.close();
    }
}