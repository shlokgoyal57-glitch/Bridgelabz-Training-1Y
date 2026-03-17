package BuiltInFunction;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        LocalDate newDate = date.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        newDate = newDate.minusWeeks(3);

        System.out.println("Final Date: " + newDate);
    }
}
