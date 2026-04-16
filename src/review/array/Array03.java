package review.array;

public class Array03 {
    static void main() {
        int [] array = {10,20,30,40,50};
        for(int i=0;i<array.length;i++) {
            System.out.print((i+1)+" : "+array[i]+",");
        }
        System.out.println();
        for(int item:array) {
            System.out.print(item+",");
        }
    }
}
