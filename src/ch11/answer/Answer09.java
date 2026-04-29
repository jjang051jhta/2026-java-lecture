package ch11.answer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Answer09 {
    static void main() {
        Map<String,Nation> nationMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        nationMap.put("한국", new Nation("한국","서울"));
        nationMap.put("미국", new Nation("미국","워싱턴"));
        nationMap.put("프랑스", new Nation("프랑스","파리"));
        nationMap.put("영국", new Nation("영국","런던"));
        nationMap.put("중국", new Nation("중국","베이징"));
        nationMap.put("일본", new Nation("일본","도쿄"));
        for(Map.Entry<String,Nation> entry:nationMap.entrySet()) {
            String country = entry.getKey();
            Nation nation = entry.getValue();
            System.out.println(nation.toString());
        }
    }
}
class Nation {
    String name;
    String capital;

    public Nation(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}