package ch11.compare.answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer11 {
    static void main() {
        Order[] orders = {
                new Order("kim", 3000, 2),
                new Order("lee", 2000, 5),
                new Order("kim", 1000, 5),
                new Order("park", 3000, 1),
                new Order("lee", 2000, 3)
        };
        Arrays.sort(orders,new OrderComparator());
        System.out.println(Arrays.toString(orders));
    }
}
class Order {
    private  String name;
    private int price;
    private int quantity;

    public Order(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public int getTotal() {
        return price*quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
class OrderComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        int result = Integer.compare(o1.getTotal(),o2.getTotal());
        if(result == 0) {
            result = Integer.compare(o2.getQuantity(),o1.getQuantity());
        }
        if(result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}