package ch07.lang.string;

public class StringChangeTest {
    static void main() {
        String str = "Hello, Java! Welcome to Java World";
        System.out.println("index 7부터 나머지 글자 잘라보기 : "+str.substring(7));
        System.out.println("index 7부터 12까지의 글자 잘라보기 : "+str.substring(7,12));
        System.out.println("문자열 결합 : "+str.concat("!!!"));
        System.out.println("Java를 World로 대체 : "+str.replace("Java","World"));
        System.out.println("첫번째 Java를 World로 대체 : "+str.replaceFirst("Java","World"));
        System.out.println(str);
    }
}
