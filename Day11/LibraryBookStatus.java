import java.util.Scanner;

class Book {

    String bookId;
    String title;
    String author;
    boolean issued = false;

    void readBook(Scanner sc) {

        System.out.print("Enter Book ID: ");
        bookId = sc.nextLine();

        System.out.print("Enter Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author: ");
        author = sc.nextLine();
    }

    void issueBook() {

        if (!issued) {
            issued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {

        if (issued) {
            issued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    void displayBook() {

        System.out.println("\n===== BOOK DETAILS =====");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Book Status : " + (issued ? "Issued" : "Available"));
    }
}

public class LibraryBookStatus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        b.readBook(sc);

        b.issueBook();
        b.displayBook();

        b.returnBook();
        b.displayBook();

        sc.close();
    }
}