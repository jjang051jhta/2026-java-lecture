package ch11.answer;

import java.util.*;

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
        List<Nation> nationList = new ArrayList<>(nationMap.values());
        for(Map.Entry<String,Nation> entry:nationMap.entrySet()) {
            String country = entry.getKey();
            Nation nation = entry.getValue();
            System.out.println(nation.toString());
        }
        Random random = new Random();
        while(true) {
            int index =  random.nextInt(nationList.size());
            Nation nation = nationList.get(index);
            System.out.println(nation.name+"의 수도는?");
            String input = scanner.nextLine();
            if(input.equals("그만")) break;
            if(input.equals(nation.capital)) {
                System.out.println("정답");
            } else {
                System.out.println("땡 / 정답은 "+nation.capital+"입니다.");
            }
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