package ch11.answer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//3."그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고
//다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라.
//다음 해시맵을 이용하라.
public class Answer03 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> countryMap = new HashMap<>();
        //인터페이스는 구현체를 가지고 있아야 한다.
        System.out.println("나라 이름과 인구를 입력하세요.  ex) korea 5000");
        while(true) {
            String country = scanner.next();
            if(country.equals("그만")) {
                break;
            }
            Integer population = scanner.nextInt();
            countryMap.put(country,population);
        }
        System.out.println("나라를 입력하면 인구수를 알려드립니다.");
        while (true) {
            String country = scanner.next();
            if(country.equals("그만")) {
                break;
            }
            Integer population = countryMap.get(country);
            if(population == null) {
                System.out.println("없는 나라입니다.");
            } else {
                System.out.println(country + "의 인구는 " + population);
            }
        }
    }
}
