package ch11.compare.answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer07 {
    static void main() {
        Product [] products= {
                new Product("A",3000),
                new Product("B",1000),
                new Product("C",2000),
                new Product("D",1000)
        };
        Arrays.sort(products, new ProductComparator());
        System.out.println(Arrays.toString(products));
    }
}
class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        int result = Integer.compare(o1.getPrice(),o2.getPrice());
        if(result ==0 ) {
            return o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}