package ch07.lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object object) {
        String string =
                "매개변수로 넘겨받은 객체 정보 출력"
                + object.toString();
        System.out.println(string);
    }
}
