package ch09.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatTest {
    static void main() {
        //String strDate = "2026/04/24"; //20260426, 2026년 4월 24일
        LocalDate date =  LocalDate.of(2026,4,24);
//        int year =  date.getYear();
//        int month =  date.getMonthValue();
//        int day =  date.getDayOfMonth();
//        System.out.println(year+"/"+month+"/"+day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
        System.out.println("String을 Date로");
        String input = "2030-12-25";
        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parseDate = LocalDate.parse(input,formatter02);
        System.out.println(parseDate);
        //System.out.println(formattedDate.equals("2026/04/24"));
    }
}
