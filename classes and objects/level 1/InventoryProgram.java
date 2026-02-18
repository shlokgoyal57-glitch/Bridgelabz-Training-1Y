package com.gla.ObjectsClasses.level1.level01;
import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void setDetails(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Item item = new Item();
        item.setDetails(code, name, price);

        item.displayDetails();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));

        sc.close();
    }
}

