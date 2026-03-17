package BuiltInFunction;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesDate {

    public static void main(String[] args) {

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        ZonedDateTime gmtTime =
                ZonedDateTime.now(ZoneId.of("GMT"));

        ZonedDateTime istTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime pstTime =
                ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in Different Zones:");
        System.out.println("GMT : " + gmtTime.format(format));
        System.out.println("IST : " + istTime.format(format));
        System.out.println("PST : " + pstTime.format(format));
    }
}