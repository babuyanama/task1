import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
}

class Manufacturer {
    private String name;
    private List<Vendor> vendors;

    public Manufacturer(String name) {
        this.name = name;
        this.vendors = new ArrayList<>();
    }

    public void addVendor(Vendor vendor) {
        vendors.add(vendor);
    }

    // Other methods as needed
}

class Vendor {
    private String name;
    private List<Product> products;

    public Vendor(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // Other methods as needed
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // Other methods as needed
}

class Order {
    private List<Product> products;
    private double totalCost;

    public Order(List<Product> products) {
        this.products = products;
        calculateTotalCost();
    }

    private void calculateTotalCost() {
        // Logic to calculate total cost based on products
    }

    // Getters and setters
}

class Invoice {
    private Order order;
    private double rawMaterialCost;
    private double assemblyCost;
    private double totalCost;

    public Invoice(Order order, double rawMaterialCost, double assemblyCost) {
        this.order = order;
        this.rawMaterialCost = rawMaterialCost;
        this.assemblyCost = assemblyCost;
        calculateTotalCost();
    }

    private void calculateTotalCost()
    {
        // Logic to calculate total cost including raw material and assembly costs
    }

    // Getters and setters
}

public class InventoryManagementSystem
{
    public static void main(String[] args)
    
        // Implement the main logic of the inventory management system here
    }
}
