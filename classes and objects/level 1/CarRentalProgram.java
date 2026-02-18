package com.gla.ObjectsClasses.level2.level01;
import java.util.Scanner;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    // Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("\nRental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class CarRentalProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Rental Days: ");
        int days = sc.nextInt();

        CarRental rental = new CarRental(name, model, days);
        rental.display();

        sc.close();
    }
}
