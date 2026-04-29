package ch11.answer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//4. List 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라.
//강수량을 입력하면 ArrayList에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
public class Answer04 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        List<Integer> rainList = new ArrayList<>();
        //길이가 정해져 있지 않을때 가변적일때 쓴다.
        while (true) {
            int rain = scanner.nextInt();
            if(rain ==0) break;
            rainList.add(rain);
            sum+=rain;
            Iterator<Integer> iterator = rainList.iterator();
            while (iterator.hasNext()){
                System.out.print(iterator.next()+ " , ");
            }
            System.out.println("평균 강수량은  "+(double)sum / rainList.size());
        }
    }
}
