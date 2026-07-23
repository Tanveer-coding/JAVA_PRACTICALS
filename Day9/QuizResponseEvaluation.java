import java.util.Scanner;

public class QuizResponseEvaluation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char answerKey[] = new char[10];
        char responses[] = new char[10];

        System.out.println("Enter Answer Key");

        for (int i = 0; i < 10; i++) {
            System.out.print("Answer " + (i + 1) + ": ");
            answerKey[i] = sc.next().toUpperCase().charAt(0);
        }

        System.out.println("\nEnter Student Responses");

        for (int i = 0; i < 10; i++) {
            System.out.print("Response " + (i + 1) + ": ");
            responses[i] = sc.next().toUpperCase().charAt(0);
        }

        int correct = 0;
        int incorrect = 0;
        int unattempted = 0;

        for (int i = 0; i < 10; i++) {

            if (responses[i] == 'X') {
                unattempted++;
            }
            else if (responses[i] == answerKey[i]) {
                correct++;
            }
            else {
                incorrect++;
            }
        }

        int score = correct;

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Correct Answers : " + correct);
        System.out.println("Incorrect Answers : " + incorrect);
        System.out.println("Unattempted : " + unattempted);
        System.out.println("Score : " + score);

        sc.close();
    }
}