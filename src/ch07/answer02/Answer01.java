package ch07.answer02;

//String[]arr= {"10","20","30","40"};
public class Answer01 {
    static void main() {
        String []arr= {"10","20","30","40"};  //"10" ---> 10
        int sum = 0;
        //Wrapper
        Integer integer = 10; // autoboxing
        //System.out.println(Integer.parseInt(arr[0])+10);
        for(String num:arr) {
            sum+=Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
