package ch09.answer;

import java.time.LocalDate;

//2026-10-15가 2026년의 몇 번째 날인지 출력하시오.
public class Answer03 {
    static void main() {
        LocalDate date =  LocalDate.of(2026,10,15);
        System.out.println("date.getDayOfMonth() = "+date.getDayOfMonth());
        System.out.println("date.getDayOfYear() = "+date.getDayOfYear());
        System.out.println("date.getDayOfWeek() = "+date.getDayOfWeek());
    }
}
