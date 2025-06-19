package InventoryManagement.References;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryManagerCLI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        int nextId = 1;

        while (true) {
            System.out.println("\n=== Inventory Menu ===");
            System.out.println("1. Add Product");
            System.out.println("2. Add Stock");
            System.out.println("3. Remove Stock");
            System.out.println("4. Show Low-Stock Items");
            System.out.println("5. Inventory Value");
            System.out.println("6. List Products");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.print("Product name: ");
                String name = scanner.nextLine();

                System.out.print("Initial quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());

                System.out.print("Price per unit: ");
                double price = Double.parseDouble(scanner.nextLine());

                System.out.print("Reorder level: ");
                int reorderLevel = Integer.parseInt(scanner.nextLine());

                Product product = new Product(nextId++, name, quantity, price, reorderLevel);
                products.add(product);
                System.out.println("Product added.");
            }

            else if (choice == 2) {
                System.out.print("Product ID: ");
                int id = Integer.parseInt(scanner.nextLine());

                Product product = findProduct(products, id);
                if (product == null) {
                    System.out.println("Product not found.");
                    continue;
                }

                System.out.print("Quantity to add: ");
                int qty = Integer.parseInt(scanner.nextLine());
                product.addStock(qty);
                System.out.println("Stock updated.");
            }

            else if (choice == 3) {
                System.out.print("Product ID: ");
                int id = Integer.parseInt(scanner.nextLine());

                Product product = findProduct(products, id);
                if (product == null) {
                    System.out.println("Product not found.");
                    continue;
                }

                System.out.print("Quantity to remove: ");
                int qty = Integer.parseInt(scanner.nextLine());
                if (qty > product.getQuantity()) {
                    System.out.println("Not enough stock.");
                } else {
                    product.removeStock(qty);
                    System.out.println("Stock updated.");
                }
            }

            else if (choice == 4) {
                System.out.println("Low-stock items:");
                for (Product p : products) {
                    if (p.getQuantity() <= p.getReorderLevel()) {
                        System.out.println(p);
                    }
                }
            }

            else if (choice == 5) {
                double total = 0;
                for (Product p : products) {
                    total += p.getQuantity() * p.getPrice();
                }
                System.out.printf("Total inventory value: %.2f%n", total);
            }

            else if (choice == 6) {
                if (products.isEmpty()) {
                    System.out.println("No products.");
                } else {
                    for (Product p : products) {
                        System.out.println(p);
                    }
                }
            }

            else if (choice == 7) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    private static Product findProduct(List<Product> products, int id) {
        for (Product p : products) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }
}