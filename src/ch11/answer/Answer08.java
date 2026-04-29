package ch11.answer;

import java.util.*;

public class Answer08 {
    static void main() {
        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("장동건", new Customer("장동건",100));
        customerMap.put("원빈", new Customer("원빈",100));
        customerMap.put("현빈", new Customer("현빈",100));
        customerMap.put("고수", new Customer("고수",100));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("이름과 포인트 입력 ex) 장동건 10");
            String name =  scanner.next();
            if(name.equals("그만")) break;
            int point  = scanner.nextInt();
            Customer  customer = customerMap.get(name);
            customer.point+=point;
            customerMap.put(name,new Customer(name,customer.point));
            Set<Map.Entry<String,Customer>> entrySet =  customerMap.entrySet();
            Iterator<Map.Entry<String,Customer>> iterator = entrySet.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().getValue());
            }
        }
    }
}
class Customer {
    String name;
    int point;

    public Customer(String name, int point) {
        this.name = name;
        this.point = point;
    }

    @Override
    public String toString() {
        return "(" +
                "name='" + name + '\'' +
                ", point=" + point +
                ')';
    }
}