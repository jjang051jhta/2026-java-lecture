package review.array;

import java.util.Scanner;

public class ArrayEx02 {
    static void aa() {
        System.out.println("aa");
    }
    static void main() {
        String [] productNameArray = new String[10];
        int [] productPriceArray = new int[10];
        int count=0;
        System.out.println(Math.PI);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("1 : 상품 등록 | 2 : 상품 목록 | 3 : 종료 \n 메뉴를 선택하세요.");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if(menu==1) {
                //System.out.println("상품 등록");
                System.out.print("상품 이름을 쓰세요");
                String name = scanner.nextLine();
                productNameArray[count] = name;
                System.out.print("상품 가격을 쓰세요");
                int price = scanner.nextInt();
                productPriceArray[count] = price;
                count++;
            } else if(menu==2) {
                if(count==0) {
                    System.out.println("등록된 제품이 없습니다.");
                    continue;
                }
                System.out.println("상품 목록");
                for(int i=0;i<count;i++) {
                    System.out.println(productNameArray[i]+" : "+productPriceArray[i]+"원");
                }
            } else if(menu==3) {
                System.out.println("종료");
                break;
            }
        }
    }
}
