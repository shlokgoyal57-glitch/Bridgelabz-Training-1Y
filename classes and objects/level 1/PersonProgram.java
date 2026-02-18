package com.gla.ObjectsClasses.level2.level01;
import java.util.Scanner;

class Person {
    String name;
    int age;

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Person p1 = new Person(name, age);
        Person p2 = new Person(p1); // Copy constructor

        System.out.println("\nOriginal Person:");
        p1.display();

        System.out.println("\nCopied Person:");
        p2.display();
    }
}

