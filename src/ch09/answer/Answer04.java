package ch09.answer;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//다음 두 날짜 사이를 Period를 사용하지 말고,
//ChronoUnit과 날짜 계산만 사용하여 **총 개월 수 + 남은 일수** 형태로 출력하시오.
public class Answer04 {
    static void main() {
        LocalDate start = LocalDate.of(2026,4,23);
        LocalDate end = LocalDate.of(2026,12,25);
        Period period = Period.between(start,end);
        //System.out.println(period);
        System.out.println(period.getMonths()+"개월"+period.getDays()+"일");
        long months = ChronoUnit.MONTHS.between(start,end);
        System.out.println(months);
        LocalDate temp = start.plusMonths(months);
        long days = ChronoUnit.DAYS.between(temp,end);
        System.out.println(days);
        System.out.println(months+"개월"+days+"일");
    }
}
