import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class Product
abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method to get the price
    public abstract double getPrice();

    // Abstract method to get the description
    public abstract String getDescription();
}

// ElectronicsProduct Class
class ElectronicsProduct extends Product {
    private String warrantyPeriod;

    public ElectronicsProduct(String name, double price, String warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Electronics Product: " + name + ", Price: $" + price + ", Warranty: " + warrantyPeriod;
    }
}

// ClothingProduct Class
class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing Product: " + name + ", Price: $" + price + ", Size: " + size;
    }
}

// BookProduct Class
class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book Product: " + name + ", Price: $" + price + ", Author: " + author;
    }
}

// ShoppingCart Class
class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.getDescription());
        }
    }
}

// Main class to demonstrate functionality
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.print("Enter the number of products to add to the cart: ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Enter product type (electronics/clothing/book): ");
            String type = scanner.nextLine().trim().toLowerCase();

            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            switch (type) {
                case "electronics":
                    System.out.print("Enter warranty period: ");
                    String warrantyPeriod = scanner.nextLine();
                    cart.addProduct(new ElectronicsProduct(name, price, warrantyPeriod));
                    break;
                case "clothing":
                    System.out.print("Enter size: ");
                    String size = scanner.nextLine();
                    cart.addProduct(new ClothingProduct(name, price, size));
                    break;
                case "book":
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    cart.addProduct(new BookProduct(name, price, author));
                    break;
                default:
                    System.out.println("Invalid product type. Please enter 'electronics', 'clothing', or 'book'.");
                    i--; // Decrement i to repeat this iteration
                    break;
            }
        }

        System.out.println("\nProducts in the Shopping Cart:");
        cart.displayProducts();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());

        scanner.close();
    }
}
