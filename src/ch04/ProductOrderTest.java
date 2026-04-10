package ch04;

public class ProductOrderTest {
    static void main() {
        ProductOrder productOrder01 = new ProductOrder();
        productOrder01.productName = "디올";
        productOrder01.quantity = 5;
        productOrder01.price = 12_000_000;

        ProductOrder productOrder02 = new ProductOrder();
        productOrder02.productName = "샤넬";
        productOrder02.quantity = 3;
        productOrder02.price = 25_000_000;

        ProductOrder productOrder03 = new ProductOrder();
        productOrder03.productName = "프라다";
        productOrder03.quantity = 7;
        productOrder03.price = 2_000_000;

        ProductOrder productOrder04 = new ProductOrder();
        productOrder04.productName = "루이비똥";
        productOrder04.quantity = 4;
        productOrder04.price = 10_000_000;

        ProductOrder productOrder05 = new ProductOrder();
        productOrder05.productName = "나이키";
        productOrder05.quantity = 10;
        productOrder05.price = 100_000;

        //ProductOrder [] orders = new ProductOrder[5];
        //orders[0]= productOrder01;
        //orders[1]= productOrder02;
        //orders[2]= productOrder03;
        //orders[3]= productOrder04;
        //orders[4]= productOrder05;
        int totalPrice=0;
        ProductOrder [] orders = {productOrder01,productOrder02,productOrder03,productOrder04,productOrder05};
//        for(int i=0;i< orders.length;i++ ){
//            System.out.println("상품명 : "+orders[i].productName+", 수량 : "+orders[i].quantity+", 가격 : "+orders[i].price);
//            totalPrice+= orders[i].price*orders[i].quantity;
//        }
        for(ProductOrder order:orders){
            System.out.println("상품명 : "+order.productName+", 수량 : "+order.quantity+", 가격 : "+order.price);
            totalPrice+= order.price*order.quantity;
        }
        System.out.println(" 총액 : "+totalPrice);
    }
}
