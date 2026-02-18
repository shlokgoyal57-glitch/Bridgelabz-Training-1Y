package com.gla.ObjectsClasses.level1.level01;
import java.util.Scanner;

class Circle {
    double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle();
        circle.setRadius(radius);
        circle.display();

        sc.close();
    }
}

