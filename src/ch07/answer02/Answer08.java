package ch07.answer02;

public class Answer08 {
    static void main() {
        String[] arr = {"11", "24", "36", "41", "52", "67", "80"};
        int count = 0;
        for (String str : arr) {
            int num = Integer.parseInt(str);
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }


}
