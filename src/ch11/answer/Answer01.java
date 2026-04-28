package ch11.answer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Answer01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 숫자는 입력하세요");
        List<Integer> nums = new ArrayList<>();
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            nums.add(num);
        }
        //System.out.println(nums);
        Iterator<Integer> iterator = nums.iterator();
        int big = 0;
        //1,2,3,4,5,6,7
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp > big) {
                big = temp;
            }
        }
        System.out.println(nums + "중 제일 큰 숫자  : " + big);
    }
}
