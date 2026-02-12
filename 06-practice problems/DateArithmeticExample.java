import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Formatter for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Take date input
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, 2 years
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Display results
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After Adding 7 days, 1 month, 2 years: " + updatedDate.format(formatter));
        System.out.println("After Subtracting 3 weeks: " + finalDate.format(formatter));

        sc.close();
    }
}
