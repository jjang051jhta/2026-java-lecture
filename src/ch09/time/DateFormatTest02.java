package ch09.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatTest02 {
    static void main() {
        LocalDateTime now = LocalDateTime.of(2026,4,24,13,40,59);
        //2026/04/24 13:40:59
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String strNow = now.format(dateTimeFormatter);
        System.out.println(strNow);
        String input = "2026-04-24 13:43:59";
        DateTimeFormatter dateTimeFormatter02 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDt = LocalDateTime.parse(input,dateTimeFormatter02);
        System.out.println(parsedDt);
    }
}
