package ch07.answer02;

//String[]arr= {"87","15","92","43","100","29"};
public class Answer02 {
    static void main() {
        String[]arr= {"87","15","92","43","100","29"};
        int max = Integer.parseInt(arr[0]); //87
        for(String str:arr) {
            int num = Integer.parseInt(str);
            if(num>max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
