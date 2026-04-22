package ch07.answer02;

public class Answer10 {
    static void main() {
        String[] arr = {"100", "200", "hello", "300", "java", "400"};
        int count = 0;
        for(String str:arr) {
            try {
                int num = Integer.parseInt(str);
                System.out.println(num);
                count++;
            } catch (NumberFormatException e) {
                System.out.println(e);
                //e.printStackTrace();
            }
        }
    }
}
