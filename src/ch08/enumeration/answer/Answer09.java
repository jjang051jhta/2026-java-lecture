package ch08.enumeration.answer;

public class Answer09 {
    static void main() {
        Grade[] values = Grade.values();
        for (Grade value : values) {
            if(value.name().equals("DIAMOND")) {
                System.out.println("찾음 "+value.name());
            }
        }
    }
}
