import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // b. Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // start index is greater than end index
        System.out.println(text.substring(5, 2));
    }

    // c. Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // start index is greater than end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled successfully");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. User input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // d. First call method to generate exception
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated in generateException()");
        }

        // Then call method to handle the exception
        handleException(text);

        sc.close();
    }
}
