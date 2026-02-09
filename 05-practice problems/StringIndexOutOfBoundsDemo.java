import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // b. Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println(text.charAt(text.length())); 
    }

    // c. Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Accessing index beyond string length
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully");
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generateException()");
        }

        // Then call method to handle exception
        handleException(text);

        sc.close();
    }
}
