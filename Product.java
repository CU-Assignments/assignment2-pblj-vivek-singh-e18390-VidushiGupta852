import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("\nProduct Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();

        // Creating a product instance
        Product product = new Product(id, name, price);
        product.displayProduct();

        scanner.close();
    }
}


