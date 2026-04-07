package ch02;

import java.time.LocalDate;

public class SwitchTest02 {
    static void main() {
        int month = 4;
        String season = null;
        season = switch (month) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8, 9 -> "여름";
            default -> "가을";
        };
        System.out.println(season);


        //LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2027,4,7);
        System.out.println(today);
        System.out.println(today.getDayOfWeek().getValue());
        int day = today.getDayOfWeek().getValue();
        //switch 문
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("해당하는 요일이 없습니다.");
        }
        //enhanced switch
        switch (day) {
            case 1 -> System.out.println("월요일");
            case 2 -> System.out.println("화요일");
            case 3 -> System.out.println("수요일");
            case 4 -> System.out.println("목요일");
            case 5 -> System.out.println("금요일");
            case 6 -> System.out.println("토요일");
            case 7 -> System.out.println("일요일");
            default -> System.out.println("해당하는 요일이 없습니다.");
        }

        String yoil = switch (day) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "해당하는 요일이 없습니다.";
        };
        System.out.println(yoil);
    }
}
