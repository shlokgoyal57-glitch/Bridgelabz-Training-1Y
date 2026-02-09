import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // c. Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // d. Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled successfully");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. User input as String
        System.out.print("Enter a value: ");
        String text = sc.next();

        // e. First call method to generate exception
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated in generateException()");
        }

        // Then call method to handle the exception
        handleException(text);

        sc.close();
    }
}
