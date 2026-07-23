import java.util.Scanner;

public class JVMJourney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        String stage1 = "Java Source Code (.java)";
        String stage2 = "Java Compiler (javac)";
        String stage3 = "Bytecode (.class)";
        String stage4 = "Class Loader";
        String stage5 = "JVM Execution Engine";
        String stage6 = "Machine Output";

        System.out.println("\nJVM EXECUTION JOURNEY");
        System.out.println("Student: " + student);
        System.out.println("1. " + stage1);
        System.out.println("2. " + stage2);
        System.out.println("3. " + stage3);
        System.out.println("4. " + stage4);
        System.out.println("5. " + stage5);
        System.out.println("6. " + stage6);
    }
}