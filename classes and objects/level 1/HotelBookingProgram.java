package com.gla.ObjectsClasses.level2.level01;
import java.util.Scanner;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display() {
        System.out.println("\nBooking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelBooking h1 = new HotelBooking();
        System.out.println("Default Booking:");
        h1.display();

        System.out.print("\nEnter Guest Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Type: ");
        String room = sc.nextLine();

        System.out.print("Enter Number of Nights: ");
        int nights = sc.nextInt();

        HotelBooking h2 = new HotelBooking(name, room, nights);
        HotelBooking h3 = new HotelBooking(h2);

        System.out.println("\nParameterized Booking:");
        h2.display();

        System.out.println("\nCopied Booking:");
        h3.display();
    }
}

