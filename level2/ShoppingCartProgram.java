/*
Program to Simulate a Shopping Cart
Problem Statement: 
Create a CartItem class with attributes itemName, price, and quantity. 
Add methods to:
1. Add an item to the cart.
2. Remove an item from the cart.
3. Display the total cost.

Explanation: 
The CartItem class models a shopping cart item. 
The methods handle cart operations like adding or removing items and calculating the total cost.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;
        do {
            System.out.println("\n===== Shopping Cart Menu =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(new CartItem(name, price, qty));
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayTotalCost();
                    break;

                case 4:
                    System.out.println("Thank you for shopping with us!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

// Class representing a single cart item
class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

// Class representing the shopping cart
class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    // Add an item to the cart
    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to the cart.");
    }

    // Remove an item from the cart
    public void removeItem(String itemName) {
        boolean removed = false;
        for (CartItem item : items) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                items.remove(item);
                System.out.println(itemName + " removed from the cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found in the cart.");
        }
    }

    // Display total cost
    public void displayTotalCost() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        double total = 0;
        System.out.println("\nItems in your cart:");
        for (CartItem item : items) {
            System.out.println(item.itemName + " - Quantity: " + item.quantity + " | Price: INR " + item.price + " | Subtotal: INR " + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("----------------------------------");
        System.out.println("Total Cost: INR " + total);
        System.out.println("----------------------------------");
    }
}
