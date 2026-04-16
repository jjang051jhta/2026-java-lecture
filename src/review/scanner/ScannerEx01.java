package review.scanner;

import java.util.Scanner;

public class ScannerEx01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요 : ");
        String menu = scanner.nextLine();
        System.out.print("음식 가격을 입력해주세요 : ");
        int price = scanner.nextInt();
        System.out.print("음식 수량을 입력해주세요 : ");
        int quantity = scanner.nextInt();
        System.out.println(menu+quantity+"개를 주문하셨습니다. 총 가격은 "+(price*quantity)+"원입니다.");
    }
}
