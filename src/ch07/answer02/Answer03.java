package ch07.answer02;

//String str="89.75";
public class Answer03 {
    static void main() {
        String str = "89.75";
        System.out.println(Double.parseDouble(str));
        double num = Double.parseDouble(str);
        System.out.println(Math.round(num));
    }
}
