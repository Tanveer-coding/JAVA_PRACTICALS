import java.util.Scanner;

public class FitnessCalorieRecommendation {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to return BMI Category
    public static String getBMICategory(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight, height;

        System.out.print("Enter Weight (kg): ");
        weight = sc.nextDouble();

        System.out.print("Enter Height (m): ");
        height = sc.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Invalid Input.");
            return;
        }

        double bmi = calculateBMI(weight, height);

        String category = getBMICategory(bmi);

        System.out.println("\n===== FITNESS REPORT =====");
        System.out.printf("BMI : %.2f\n", bmi);
        System.out.println("Category : " + category);

        if (category.equals("Underweight")) {
            System.out.println("Recommendation : Increase healthy calorie intake.");
        } else if (category.equals("Normal")) {
            System.out.println("Recommendation : Maintain regular exercise and balanced diet.");
        } else if (category.equals("Overweight")) {
            System.out.println("Recommendation : Exercise regularly and reduce calorie intake.");
        } else {
            System.out.println("Recommendation : Consult a fitness expert and follow a healthy lifestyle.");
        }

        sc.close();
    }
}