package ch07.answer;

//2 String str = "banana";에서 a글자 세기
public class Answer02 {
    static void main() {
        String str = "banana";
        int count = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
