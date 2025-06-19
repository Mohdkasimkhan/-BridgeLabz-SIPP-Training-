package BUILTINFUNCTION;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        //  Get the current date
        LocalDate today = LocalDate.now();

        //  Create formatters for different patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        //  Print the date in different formats
        System.out.println("Format 1 (dd/MM/yyyy): " + today.format(format1));
        System.out.println("Format 2 (yyyy-MM-dd): " + today.format(format2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + today.format(format3));
    }
}

