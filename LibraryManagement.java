// Base class
import java.util.Scanner;

// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class for Fiction books
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayDetails();
    }
}

// Derived class for Non-Fiction books
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayDetails();
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Fiction book
        System.out.println("Enter Fiction Book Details:");
        System.out.print("Title: ");
        String fictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String fictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double fictionPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionPrice);

        // Input for Non-Fiction book
        System.out.println("\nEnter Non-Fiction Book Details:");
        System.out.print("Title: ");
        String nonFictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String nonFictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double nonFictionPrice = scanner.nextDouble();

        NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);

        // Display details
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();

        scanner.close();
    }
}
