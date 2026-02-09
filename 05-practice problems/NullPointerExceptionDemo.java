public class NullPointerExceptionDemo {

    // a. Method to generate NullPointerException
    public static void generateException() {
        String text = null;   // variable initialized to null
        System.out.println(text.length()); // causes NullPointerException
    }

    // e. Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;   // variable initialized to null

        try {
            System.out.println(text.length()); // risky code
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully");
        }
    }

    public static void main(String[] args) {

        // b. First call the method that generates exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated in generateException()");
        }

        // Then call the method that handles the exception
        handleException();
    }
}


