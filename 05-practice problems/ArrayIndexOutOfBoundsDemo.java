import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // b. Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index beyond array length
        System.out.println(names[names.length]); 
    }

    // c. Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Accessing index beyond array length
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled successfully");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input for array of names
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // d. First call method to generate exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generateException()");
        }

        // Then call method to handle the exception
        handleException(names);

        sc.close();
    }
}
