package BUILTINFUNCTION;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Take input from user
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        // Convert input to LocalDate
        LocalDate date = LocalDate.parse(input);

        //  Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        //  Subtract 3 weeks (i.e. 21 days)
        LocalDate finalDate = updatedDate.minusWeeks(3);

        //  result
        System.out.println("Original Date: " + date);
        System.out.println("Final Date after arithmetic: " + finalDate);

        scanner.close();
    }
}

