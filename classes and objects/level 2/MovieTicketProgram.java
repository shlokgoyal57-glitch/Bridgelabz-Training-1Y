package com.gla.ObjectsClasses.level1.level02;
import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket Booked Successfully!");
    }

    void displayDetails() {
        System.out.println("\nTicket Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket(movie, seat, price);
        ticket.displayDetails();
    }
}

