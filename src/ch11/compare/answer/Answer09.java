package ch11.compare.answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer09 {
    static void main() {
        String [] nums= {"10","2","30","21","1"};
        Arrays.sort(nums,new NumberStringComparator());
        System.out.println(Arrays.toString(nums));
    }
}
class NumberStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int num01 = Integer.parseInt(o1);
        int num02 = Integer.parseInt(o2);
        return Integer.compare(num01,num02);
    }
}