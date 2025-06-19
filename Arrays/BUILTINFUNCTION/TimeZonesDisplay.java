package BUILTINFUNCTION;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZonesDisplay {
    public static void main(String[] args) {
        // Formatter to display the date and time in readable format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // Get current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("GMT Time: " + gmtTime.format(formatter));

        // Get current time in IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST (India) Time: " + istTime.format(formatter));

        // Get current time in PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("PST (US) Time: " + pstTime.format(formatter));
    }
}
