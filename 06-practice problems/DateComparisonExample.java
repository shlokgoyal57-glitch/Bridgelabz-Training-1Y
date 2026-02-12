import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparisonExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Take first date
        System.out.print("Enter first date (dd-MM-yyyy): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine(), formatter);

        // Take second date
        System.out.print("Enter second date (dd-MM-yyyy): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine(), formatter);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date.");
        } 
        else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date.");
        } 
        else if (date1.isEqual(date2)) {
            System.out.println("Both dates are SAME.");
        }

        sc.close();
    }
}
