package ch09.answer;

import java.time.LocalDateTime;

//회의 시작 시각:2026-05-10T14:30
//90분 전 시각:2026-05-10T13:00
public class Answer06 {
    static void main() {
        LocalDateTime localDateTime = LocalDateTime.of(2026,5,10,14,30);
        LocalDateTime minus90 = localDateTime.minusMinutes(90);
        System.out.println(minus90);
    }
}
