import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    void readData(Scanner sc) {

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        holderName = sc.nextLine();

        System.out.print("Enter Opening Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {

        if (amount > 0)
            balance += amount;
    }

    void withdraw(double amount) {

        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance.");
    }

    void displayAccount() {

        System.out.println("\n===== ACCOUNT SUMMARY =====");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder : " + holderName);
        System.out.printf("Final Balance : Rs. %.2f\n", balance);
    }
}

public class BankAccountOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();

        acc.readData(sc);

        System.out.print("Enter Deposit Amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter Withdrawal Amount: ");
        acc.withdraw(sc.nextDouble());

        acc.displayAccount();

        sc.close();
    }
}