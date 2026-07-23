import java.util.Scanner;

public class TrainingFeedbackTextAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Feedback: ");
        String text = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int symbols = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else {
                symbols++;
            }
        }

        System.out.println("\n===== TEXT ANALYSIS =====");
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Digits : " + digits);
        System.out.println("Spaces : " + spaces);
        System.out.println("Other Symbols : " + symbols);

        sc.close();
    }
}