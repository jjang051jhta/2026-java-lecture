package ch11.compare;

import java.util.Arrays;

public class Compare03 {
    static void main() {
        User user01 = new User("a",30);
        User user02 = new User("b",20);
        User user03 = new User("c",10);

        User [] array = {user01,user02,user03};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparble 기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
