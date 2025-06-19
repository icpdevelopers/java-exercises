package InventoryManagement.References;

public class Product {
    private final int id;
    private String name;
    private int quantity;
    private double price;
    private int reorderLevel;

    public Product(int id, String name, int quantity, double price, int reorderLevel) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.reorderLevel = reorderLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void addStock(int qty) {
        quantity += qty;
    }

    public void removeStock(int qty) {
        quantity -= qty;
    }

    @Override
    public String toString() {
        return String.format("#%d | %s | Qty:%d | Price:%.2f | Reorder:%d",
                id, name, quantity, price, reorderLevel);
    }
}