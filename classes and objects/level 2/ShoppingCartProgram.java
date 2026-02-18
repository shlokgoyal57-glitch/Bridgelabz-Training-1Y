package com.gla.ObjectsClasses.level1.level02;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity += quantity;
        System.out.println("Item Added to Cart.");
    }

    void removeItem(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println("Item Removed from Cart.");
        } else {
            System.out.println("Cannot remove more than available quantity.");
        }
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("\nCart Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CartItem cart = new CartItem();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity to Add: ");
        int qty = sc.nextInt();

        cart.addItem(name, price, qty);

        System.out.print("Enter Quantity to Remove: ");
        int removeQty = sc.nextInt();

        cart.removeItem(removeQty);

        cart.displayTotalCost();
    }
}

