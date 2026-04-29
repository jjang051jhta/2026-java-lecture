package ch11.answer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Answer06 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Map<String,City> cities =  new HashMap<>();
        cities.put("서울", new City("서울",100,100));
        cities.put("뉴욕", new City("뉴욕",200,200));
        cities.put("도쿄", new City("서울",300,300));
        cities.put("베이징", new City("서울",400,400));
        cities.put("일산", new City("서울",500,500));

        while(true) {
            System.out.println("도시를 입력하세요. 그만을 입력하시면 종료합니다.");
            String city = scanner.nextLine();
            if(city.equals("그만")) break;
            City findedCity = cities.get(city);
            System.out.println(findedCity.toString());
        }
    }
}
class City {
    String name;
    int longitute;
    int latitude;

    public City(String name, int longitute, int latitude) {
        this.name = name;
        this.longitute = longitute;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", longitute=" + longitute +
                ", latitude=" + latitude +
                '}';
    }
}