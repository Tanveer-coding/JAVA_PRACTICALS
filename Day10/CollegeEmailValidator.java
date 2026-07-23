import java.util.Scanner;

public class CollegeEmailValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();

        String domain = "@chitkara.edu.in";

        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');

        System.out.println("\n===== EMAIL VALIDATION =====");

        if (firstAt > 0 && firstAt == lastAt && email.endsWith(domain)) {
            System.out.println("Email : " + email);
            System.out.println("Status : Valid College Email");
        } else {
            System.out.println("Email : " + email);
            System.out.println("Status : Invalid College Email");
        }

        sc.close();
    }
}