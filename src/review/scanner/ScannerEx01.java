package review.scanner;

import java.util.Scanner;

public class ScannerEx01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("음식 이름을 입력해주세요 exit를 누르면 종료합니다.: ");
            String menu = scanner.nextLine(); //"라면 \n"
            if(menu.equals("exit")) {
                break;
            }
            System.out.print("음식 가격을 입력해주세요 : ");
            int price = scanner.nextInt(); //1000
            System.out.print("음식 수량을 입력해주세요 : ");
            int quantity = scanner.nextInt(); //3
            scanner.nextLine();
            System.out.println(menu + quantity + "개를 주문하셨습니다. 총 가격은 " + (price * quantity) + "원입니다.");

        }
    }
}
