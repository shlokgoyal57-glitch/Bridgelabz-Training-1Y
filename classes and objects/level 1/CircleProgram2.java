package com.gla.ObjectsClasses.level2.level01;
import java.util.Scanner;

class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0);  // Constructor chaining
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class CircleProgram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        System.out.println("Using Default Constructor:");
        c1.display();

        System.out.print("\nEnter Radius: ");
        double r = sc.nextDouble();

        Circle c2 = new Circle(r);
        System.out.println("Using Parameterized Constructor:");
        c2.display();
    }
}

